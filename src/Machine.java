
import java.util.*;

public class Machine {

    int numSlots;
    Map<Integer, Slot> slots;
    MachineState state;
    int balance;
    int totalMoney;
    MachineState currentState;
    int selectedCode;

    public Machine(int numSlots) {
        this.numSlots = numSlots;
        slots = new HashMap<>();
        int i;
        for (i = 1; i <= numSlots; i++) {
            Slot slot = new Slot(i);
            slots.put(i, slot);
        }

        this.balance = 0;
        this.totalMoney = 0;
        this.currentState = new IdleState();
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        Slot slot = slots.get(codeNumber);
        boolean isAdded = slot.addItem(item);
        if (!isAdded) {
            throw new Exception("slot full");
        }
    }

    public void clickOnSelectProduct() throws Exception {
        if (!(currentState instanceof IdleState)) {
            throw new Exception("Machine is not in idle state");
        }

        this.currentState = this.currentState.getNextState();
    }

    public void selectProduct(int codeNumber) throws Exception {
        if (!(currentState instanceof SelectionState)) {
            throw new Exception("Machine is not in selection state");
        }
        System.err.println("Please select product code");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        if (codeNumber <= 0 && codeNumber > numSlots) {
            throw new Exception("INvalid code");
        }
        Slot slot = slots.get(codeNumber);
        if (slot.isEmpty()) {
            throw new Exception("You selected empty slot");
        }
        this.selectedCode = code;
        System.err.println("Please put coins worth" + slot.item.price);

        this.currentState = this.currentState.getNextState();
    }

    public void insertCoin() throws Exception {
        if (!(currentState instanceof CoinInsertState)) {
            throw new Exception("Machine is not in selection state");
        }
        int x = 0;
        boolean insert = true;
        Scanner scanner = new Scanner(System.in);
        while (insert) {
            System.err.println("Select y/n");
            String yn = scanner.next();
            if (yn.equals("y")) {
                String coin = scanner.next();
                if (coin.equals("ten")) {
                    x += Coin.TEN_RUPEE.value;
                } else if (coin.equals("five")) {
                    x += Coin.FIVE_RUPEE.value;
                } else if (coin.equals("two")) {
                    x += Coin.TWO_RUPEE.value;
                } else {
                    x += Coin.ONE_RUPEE.value;
                }
            } else {
                insert = false;
                break;
            }
        }
        System.err.println("x "+x);
        this.balance += x;
        this.totalMoney += x;
        this.currentState = this.currentState.getNextState();
    }

    public void clickOnDispense() throws Exception {
        if (!(currentState instanceof DispenseState)) {
            throw new Exception("Machine is not in selection state");
        }
        Slot slot = slots.get(selectedCode);
        if (this.balance < slot.item.price) {
            throw new Exception("coin less");
        }
        this.currentState = this.currentState.getNextState();
        this.balance = 0;
        slot.item = null;
    }

    public void cancel() throws Exception {
        if (currentState instanceof SelectionState) {
            this.currentState = new IdleState();
        }
        if (currentState instanceof CoinInsertState) {
            this.totalMoney -= this.balance;
            this.balance = 0;
            this.currentState = new IdleState();
        }
        throw new Exception("Cannot cancel, dispacthed");
    }

    public void printTotalAMount() {
        System.err.println("Total money " + totalMoney);
    }
}

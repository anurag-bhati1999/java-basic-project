
public class Main {

    public static void main(String args[]) {
        Item item1 = new Item(ItemType.COKE, 10);
        Item item2 = new Item(ItemType.BISCUIT, 5);
        Item item3 = new Item(ItemType.CHIPS, 20);
        Machine machine = new Machine(3);
        machine.printTotalAMount();
        try {
            machine.addItem(item1, 1);
            machine.addItem(item2, 2);
            machine.addItem(item3, 3);
            machine.clickOnSelectProduct();
            machine.selectProduct(2);
            machine.insertCoin();
            machine.clickOnDispense();
            machine.printTotalAMount();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}

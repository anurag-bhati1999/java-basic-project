
import java.util.*;

public class Machine {

    int numSlots;
    Map<Integer, Slot> slots;
    MachineState state;
    int balance;
    int totalMoney;

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
    }

}

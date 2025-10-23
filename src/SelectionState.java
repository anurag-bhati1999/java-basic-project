
public class SelectionState implements MachineState {

    public String getStateName() {
        return "Product Selection";
    }

    public MachineState getNextState() {
        return new CoinInsertState();
    }
}

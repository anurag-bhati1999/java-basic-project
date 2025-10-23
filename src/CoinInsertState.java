
public class CoinInsertState implements MachineState{

    public String getStateName() {
        return "Coin Insertion";
    }

    public MachineState getNextState() {
        return new DispenseState();
    }
}

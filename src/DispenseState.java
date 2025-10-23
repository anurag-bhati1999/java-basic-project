
public class DispenseState implements MachineState {

    public String getStateName() {
        return "Dispense Selection";
    }

    public MachineState getNextState() {
        return new IdleState();
    }
}

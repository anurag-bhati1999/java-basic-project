
public class IdleState implements MachineState {

    public String getStateName() {
        return "Idle";
    }

    public MachineState getNextState() {
        return new SelectionState();
    }
}


public class RefundInProgressState implements MachineState {

    public String getStateName() {
        return "Refund in Progress";
    }

    public MachineState getNextState() {
        return new IdleState();
    }
}

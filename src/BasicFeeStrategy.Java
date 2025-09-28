public class basicFeeStrategy {
    public double calculateFee(String vehicleType, int duration){
        switch (vehicltype.toLowerCase()) {
            case "car":
                return 10*duration;
            case "bus":
                return 20*duration;
            default:
                return 30*duration;
        }
    }
}
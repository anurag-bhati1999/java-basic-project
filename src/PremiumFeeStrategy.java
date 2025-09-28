public class PremiumFeeStrategy implements  ParkingFeeStrategy {
    public double calculateFee(String vehicleType, int duration){
        switch (vehicleType.toLowerCase()) {
            case "car":
                return 100*duration;
            case "bus":
                return 200*duration;
            default:
                return 300*duration;
        }
    }
}

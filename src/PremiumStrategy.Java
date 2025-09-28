public class premiumStrategy {
    public double calculateFee(String vehicleType, int duration){
        switch (vehicltype.toLowerCase()) {
            case "car":
                return 100*duration;
            case "bus":
                return 200*duration;
            default:
                return 300*duration;
        }
    }
}

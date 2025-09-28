public class BasicFeeStrategy implements  ParkingFeeStrategy{
    public void  BasicFeeStrategy(){

    }
    public double calculateFee(String vehicleType, int duration){
        switch (vehicleType.toLowerCase()) {
            case "car":
                return 10*duration;
            case "bus":
                return 20*duration;
            default:
                return 30*duration;
        }
    }
}
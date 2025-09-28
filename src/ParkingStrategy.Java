public interface ParkingFeeStrategy {
    double calculateFees(String vehicleType, int duration);
}
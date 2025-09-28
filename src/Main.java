
import java.util.*;

public class Main {

    public static void main(String args[]) {
        List<ParkingSpot> spots = new ArrayList<>();
        spots.add(new ParkingSpot(1));
        spots.add(new ParkingSpot(2));
        spots.add(new ParkingSpot(3));
        spots.add(new ParkingSpot(4));
        spots.add(new ParkingSpot(5));
        spots.add(new ParkingSpot(6));

        ParkingLot parkingLot = new ParkingLot(spots);

        Vehicle vehcile1 = new Vehicle("1", "car");
        Vehicle vehcile2 = new Vehicle("2", "bus");
        Vehicle vehcile3 = new Vehicle("3", "bus");
        Vehicle vehcile4 = new Vehicle("4", "car");
        Vehicle vehcile5 = new Vehicle("5", "bus");
        Vehicle vehcile6 = new Vehicle("6", "car");

        parkingLot.parkVehicle(vehcile1);

    }

    private static PaymentStrategy getPaymentStrategy(int strategy) {
        switch (strategy) {
            case 1:
                return new CashPayment();
            case 2:
                return new CreditPayment();
        }

        return  new CashPayment();
    }
}

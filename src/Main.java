
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

        Vehicle vehcile1 = new Vehicle("1", "car",new BasicFeeStrategy());
        Vehicle vehcile2 = new Vehicle("2", "bus", new BasicFeeStrategy());
        Vehicle vehcile3 = new Vehicle("3", "bus", new BasicFeeStrategy());
        Vehicle vehcile4 = new Vehicle("4", "car", new BasicFeeStrategy());
        Vehicle vehcile5 = new Vehicle("5", "bus", new PremiumFeeStrategy());
        Vehicle vehcile6 = new Vehicle("6", "car", new PremiumFeeStrategy());

        ParkingSpot v1SPot = parkingLot.parkVehicle(vehcile1);
        Scanner scanner = new Scanner(System.in);
        int paymentMethod = scanner.nextInt();
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentMethod);

        if(v1SPot != null){
            double fee = vehcile1.calculateFee(1);
            paymentStrategy.processPayment(fee);
            parkingLot.vacateSpot(vehcile1);
        }

        ParkingSpot v2SPot = parkingLot.parkVehicle(vehcile2);
        if(v2SPot != null){
            double fee = vehcile1.calculateFee(2);
            paymentStrategy.processPayment(fee);
            parkingLot.vacateSpot(vehcile2);
        }



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

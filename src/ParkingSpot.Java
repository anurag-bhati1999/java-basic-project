
public class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;    
    private Vehicle vehicle;
    
    
    public ParkingSpot(int spotNumber){
        this.spotNumber = spotNumber;
    }
    
    public void parkVehicle(Vehicle vehicle) {
        if(this.isOccupied){
             throw new IllegalStateException("Spot is already occupied.");
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }
    
    public void vacate(){
        // Check if the spot is already vacant
        if (!isOccupied) {
          throw new IllegalStateException("Spot is already vacant.");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }
    
    public boolean isOccupied() {
        return this.isOccupied;
    }
    
    public int getSpotNumber() {
        return spotNumber;
    }
    
    public Vehicle getVehicle(){
        return vehicle;
    }
}
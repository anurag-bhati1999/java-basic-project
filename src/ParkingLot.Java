
public class ParkingLot {
    private List<ParkingSpot>spots;
    
    public ParkingLot(List<ParkingSpot>spots) {
        this.spots = spots;
    }
    
    public ParkingSpot findEmptySpot(){
        for(ParkingSpot spot: this.spots) {
            if(!spot.isOccupied){
                return spot;
            }
        }
        
        return null;
    }
    
    public ParkingSpot parkVehicle(Vehicle vehicle){
        spot = this.findEmptySpot();
        if(spot != null) {
            System.out.printLn("parking vehicle of type "+ vehicle.getType() + "in slot " +spot.getSpotNumber());
            spot.parkVehicle(vehicle);
            return spot;
        }
        
        return null;
    }
    
    public ParkingSpot getSpotByVehicle(Vehicle vehicle){
        for(ParkingSpot spot: this.spots) {
            if(spot.getVehicle().equals(vehicle)){
                return spot;
            }
        }
        
        return null;
    }
    
    public void vacateSpot(Vehicle vehicle){
        ParkingSpot spot = this.getSpotByVehicle(vehicle);
        if(spot == null) {
          System.out.printLn("vehcile not alloted any spot");   
          return;
        }
        
        spot.vacate();
          System.out.printLn("spot vacated");   
        
    }
    
        // Getter for parking spots
      public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
      }
}
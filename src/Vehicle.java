
public class Vehicle {
    private String lisc;
    private String type;
    private ParkingFeeStrategy feeStrategy;
    
    public Vehicle(String lisc , String type, ParkingFeeStrategy feeStrategy){
        this.lisc = lisc;
        this.type = type;
        this.feeStrategy = feeStrategy;
    }
    
    public String getType(){
        return type;
    }
    
    public String getLiscence(){
        return lisc;
    }

    public double  calculateFee(int duration){
        return this.feeStrategy.calculateFee(type, duration);
    }
}
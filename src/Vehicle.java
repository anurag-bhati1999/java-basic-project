
public class Vehicle {
    private String lisc;
    private String type;
    
    public Vehicle(String lisc , String type){
        this.lisc = lisc;
        this.type = type;
        
    }
    
    public String getType(){
        return type;
    }
    
    public String getLiscence(){
        return lisc;
    }
}
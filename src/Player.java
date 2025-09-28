import java.util.*;
public class Player {
    String name;
    UUID id;

    public Player(String name){
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getId(){
        return id.toString();
    }

    public String getName(){
        return name;
    }
}
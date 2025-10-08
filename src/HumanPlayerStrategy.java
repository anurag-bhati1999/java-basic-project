public class HumanPlayerStrategy implements PlayerStrategy {
    public Position getNexPosition(Position curr){
      
       int i=0;
       for(i=0;i<3;i++){
         Scanner scanner = new Scanner(system.in);
         String pos = scanner.next();
            switch(pos){
            case 'U':
                return new Position(curr.row+1, curr.col);
            case 'D':
                return new Position(curr.row -1, curr.col);
            case 'L':
                return new Position(curr.row, curr.col-1);
            case 'R':
                return new Position(curr.row, curr.col+1);
            default:
                continue;
       }
       }

       return null;

       
    }
}
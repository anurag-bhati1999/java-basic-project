
public class Player {

    private String name;
    private Symbol symbol;
    private PlayerStrategy strategy;

    private Player(PlayerBuilder builder) {
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.strategy = builder.strategy;
    }

    public String getName(){
        return name;
    }

    public Symbol getSymbol(){
        return symbol;
    }

    public PlayerStrategy getStrategy(){
        return strategy;
    }

    public static class PlayerBuilder {

        String name;
        Symbol symbol;
        PlayerStrategy strategy;

        public PlayerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder withSymbol(Symbol symbol) {
            this.symbol = symbol;
            return this;
        }

        public PlayerBuilder withStrategy(PlayerStrategy strategy){
            this.strategy = strategy;
            return this;
        }

        public Player build(){
            return new Player(this);
        }

    }
}

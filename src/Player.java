
public class Player {

    String name;
    Symbol symbol;

    private Player(PlayerBuilder builder) {
        this.name = builder.name;
        this.symbol = builder.symbol;
    }

    public static class PlayerBuilder {

        String name;
        Symbol symbol;

        public PlayerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder withSymbol(Symbol symbol) {
            this.symbol = symbol;
            return this;
        }

        public Player build(){
            return new Player(this);
        }

    }
}

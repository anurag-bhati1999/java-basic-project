
public class Grocery extends Product {

    private String expiry;

    private Grocery(GroceryBuilder builder) {
        super(builder, ProductCategory.GROCERY);
        this.expiry = builder.expiry;
    }

    public static class GroceryBuilder extends Product.ProductBuilder<GroceryBuilder> {

        private String expiry;

        public GroceryBuilder setExpiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        public GroceryBuilder self() {
            return this;
        }

        public Grocery build() {
            return new Grocery(this);
        }
    }
}

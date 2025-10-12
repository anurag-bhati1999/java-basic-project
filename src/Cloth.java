
public class Cloth extends Product {

    private String brand;

    private Cloth(ClothBuilder builder) {
        super(builder);
        this.brand = builder.brand;
    }

    public static class ClothBuilder extends ProductBuilder<ClothBuilder> {

        private String brand;

        public ClothBuilder self() {
            return this;
        }

        public Cloth build() {
            return new Cloth(this);
        }

        public ClothBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
    }

}


public class Product {

    private int id;
    private String name;
    private ProductCategory category;
    private int quantity;
    private int price;
    private int threshold;

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.category = builder.category;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.threshold = builder.threshold;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public static class Builder {

        private int id;
        private String name;
        private ProductCategory category;
        private int quantity;
        private int price;
        private int threshold;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setCategory(ProductCategory category) {
            this.category = category;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setThreshold(int threshold) {
            this.threshold = threshold;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }

}

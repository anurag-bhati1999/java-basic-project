
public abstract class Product {

    private int id;
    private String name;
    private ProductCategory category;
    private int quantity;
    private int price;
    private int threshold;

    protected Product(ProductBuilder builder) {
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addStock(int stock) {
        int total = quantity + stock;
        setQuantity(total);
    }

    public ProductCategory getCategory() {
        return category;
    }

    public abstract static class ProductBuilder<T extends ProductBuilder<T>> {

        private int id;
        private String name;
        private ProductCategory category;
        private int quantity;
        private int price;
        private int threshold;

        public T setId(int id) {
            this.id = id;
            return self();
        }

        public T setName(String name) {
            this.name = name;
            return self();
        }

        public T setQuantity(int quantity) {
            this.quantity = quantity;
            return self();
        }

        public T setCategory(ProductCategory category) {
            this.category = category;
            return self();
        }

        public T setPrice(int price) {
            this.price = price;
            return self();
        }

        public T setThreshold(int threshold) {
            this.threshold = threshold;
            return self();
        }

        protected abstract T self();

        public abstract Product build();

    }

}

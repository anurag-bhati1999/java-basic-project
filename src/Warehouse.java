
import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private int id;
    private String name;
    private String location;
    private Map<Integer, Product> products;

    public Warehouse(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.products = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        boolean isProductPresent = products.containsKey(product.getId());
        if (isProductPresent) {
            product.addStock(quantity);
            System.out.println("Product quantity updated");
        } else {
            product.setQuantity(quantity);
            products.put(product.getId(), product);
            System.out.println("new product added");
        }

        System.out.println("Product " + product.getName()
                + " added in ware hours. New quantity "
                + getAvailableQuantity(product)
        );
    }

    public boolean removeQuantity(Product product, int quantity) {
        int id = product.getId();
        boolean isProductPresent = products.containsKey(id);
        if (!isProductPresent) {
            System.out.println("product " + product.getName() + " not present in warehouse");
            return false;
        } else {
            int stock = product.getQuantity();
            if (stock < quantity) {
                System.out.println("Available stock less that quantity to be removed");
                return false;
            }
            stock = stock - quantity;
            if (stock == 0) {
                products.remove(id);
            } else {
                product.setQuantity(stock);
            }
        }
        System.out.println("Product " + product.getName()
                + " quantiy reduced"
        );

        return true;
    }

    public int getAvailableQuantity(Product product) {
        if (products.containsKey(product.getId())) {
            return product.getQuantity();
        } else {
            return 0;
        }
    }

}

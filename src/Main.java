
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Grocery.GroceryBuilder groceryBuilder = new Grocery.GroceryBuilder();
        Product product1 = groceryBuilder.setId(1)
                .setName("Wheat")
                .setExpiry("2025")
                .setThreshold(20)
                .build();

        Product product2 = groceryBuilder.setId(2)
                .setName("Rice")
                .setExpiry("2025")
                .setThreshold(30)
                .build();

        Cloth.ClothBuilder clothBuilder = new Cloth.ClothBuilder();
        Product product3 = clothBuilder.setId(3)
                .setName("Shirt")
                .setBrand("Brand1")
                .setThreshold(10)
                .build();

        Warehouse warehouse = new Warehouse(1, "W1", "Indore");
        warehouse.addProduct(product1, 100);
        warehouse.addProduct(product2, 50);
        warehouse.addProduct(product3, 40);

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(warehouse);
        InventoryManager manager = InventoryManager.getInstance(warehouses);
        manager.performInventoryCheck();

        warehouse.removeQuantity(product1, 90);
        warehouse.removeQuantity(product3, 40);
        manager.performInventoryCheck();
    }
}

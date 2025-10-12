
import java.util.Collection;
import java.util.List;

public class InventoryManager {

    private static InventoryManager instance;

    private List<Warehouse> warehouses;
    private InventoryObserver observer;

    private InventoryManager(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
        this.observer = new SupplierObserver();
    }

    public static InventoryManager getInstance(List<Warehouse> warehouses) {
        if (instance == null) {
            instance = new InventoryManager(warehouses);
        }
        return instance;
    }

    public void performInventoryCheck(){
        for(Warehouse warehouse: warehouses){
            Collection<Product>products = warehouse.getAllProducts();
            for(Product product: products){
                if(product.getQuantity() < product.getThreshold()){
                    notifyManager(product);
                }
            }
        }
    }

    public void notifyManager(Product product){
        this.observer.update(product);
    }
}

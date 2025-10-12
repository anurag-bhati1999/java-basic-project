public class SupplierObserver implements InventoryObserver{
    String email;

    public void update(Product product){
        System.out.println(product.getName() + " below threshold");
    }
}
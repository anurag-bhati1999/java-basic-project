Product - id, name, quantity, thetrshold, price
ProductCategory - enum , Grocery, Fyrniture, Electorinc
Grocery - expiry, extend Product
Cloth - brand, extend Product
Warehouse-> id, name, location, Map<id,Product>, addProduct(), removeProduct()
InventoryObserver -> interface, update()
SupplierObserver ->email , update()
InventoryManager() -> List<warehouse>, List<InventoryObserver>,instance,  performInventoryCheck(),
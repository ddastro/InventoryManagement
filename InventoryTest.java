public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Mouse", 150, 299.99);
        Product p2 = new Product("P102", "Keyboard", 100, 499.99);
        Product p3 = new Product("P103", "Monitor", 75, 6999.99);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayInventory();

        manager.updateProduct("P102", 120, 479.99);
        manager.deleteProduct("P101");

        manager.displayInventory();
    }
}
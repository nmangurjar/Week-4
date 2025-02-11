package warehousemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics in storage:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("Groceries in storage:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("Furniture in storage:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}

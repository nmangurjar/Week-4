package warehousemanagementsystemtest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import warehousemanagementsystem.Electronics;
import warehousemanagementsystem.Storage;

import java.util.List;

class SmartWarehouseTest {

    @Test
    void testStorageOperations() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics phone = new Electronics("Redmi");
        electronicsStorage.addItem(phone);
        Electronics laptop = new Electronics("Lenevo");
        electronicsStorage.addItem(phone);

        List<Electronics> items = electronicsStorage.getItems();
        assertEquals(2, items.size());


    }
}

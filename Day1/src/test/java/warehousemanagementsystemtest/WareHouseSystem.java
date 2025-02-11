package warehousemanagementsystemtest;

import warehousemanagementsystem.Electronics;
import warehousemanagementsystem.Storage;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WareHouseSystem {

    void testStorageOperations() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics phone = new Electronics("Smartphone");
        electronicsStorage.addItem(phone);

        List<Electronics> items = electronicsStorage.getItems();
        assertEquals(1, items.size());


    }

}

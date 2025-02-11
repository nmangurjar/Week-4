package onlinemarketplacetest;




import static org.junit.jupiter.api.Assertions.*;

import onlinemarketplace.Product;
import onlinemarketplace.ProductCatalog;
import org.junit.jupiter.api.Test;


import java.util.List;

class OnlineMarketPlaceTest {

    @Test
    void testOperations() {

        Product<String> phone1 = new Product<>("Smartphone", 34900, "Mobile");

        Product<String> phone2 = new Product<>("Laptop", 75499, "Pc");

        // Creating Catalogs

        ProductCatalog<String> gadgetCatalog = new ProductCatalog<>();

        // Adding Products to Catalogs

        gadgetCatalog.addProduct(phone1);
        gadgetCatalog.addProduct(phone2);

        List items = gadgetCatalog.getProducts();
        assertEquals(2, items.size());


    }
}

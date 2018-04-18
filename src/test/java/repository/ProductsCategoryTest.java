package repository;
import controller.StoreController;
import model.Product;
import org.junit.Test;
/**
 * Created by robert on 4/18/2018.
 */
public class ProductsCategoryTest {
    @Test
    public void ListProductsCat1() {
        String cat1 = "aliment";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1,"prod1",cat1,10));
        storeController.addProduct(new Product(2,"prod2","cat2",20));
        if(storeController.getProductsCategory(cat1).isEmpty()){
            assert false;
        }
    }
    @Test
    public void ListProductsCat2() {
        String cat1 = "asdasdsdas";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1,"prod1","cat1",10));
        storeController.addProduct(new Product(2,"prod2","cat2",20));
        if(storeController.getProductsCategory(cat1).isEmpty()){
            assert true;
        }
    }
}

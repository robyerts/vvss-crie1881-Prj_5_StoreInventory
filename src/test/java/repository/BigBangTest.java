package repository;
import controller.StoreController;
import model.Product;
import org.junit.Test;

public class BigBangTest {
    @Test
    public void BB1() {
        AddProductTest addProductTest = new AddProductTest();
        addProductTest.AddNewProductNameAlfanumeric();
        ProductsCategoryTest productsCategoryTest = new ProductsCategoryTest();
        productsCategoryTest.ListProductsCat1();
        StockSituationTest stockSituationTest = new StockSituationTest();
        stockSituationTest.StockSituationProductFound();

        StoreController storeController =new StoreController();
        String name = "AazZ19";
        try{
            Product p1 = new Product(1, name, "aliment",20);
            storeController.addProduct(p1);
            if(!storeController.getStoreRepository().getAllProducts().contains(p1))
                assert false;
        } catch(Exception e) {
            assert false;
        }
        String cat1 = "aliment";
        if(storeController.getProductsCategory(cat1).isEmpty()){
            assert false;
        }
        if(storeController.stockSituationProduct(name).size()!=1){
            assert false;
        }
    }
}

package repository;
import controller.StoreController;
import model.Product;
import org.junit.Test;

import java.io.IOException;


public class StockSituationTest {
    @Test
    public void StockSituationProductFound() {
        StoreRepository storeRepository = new StoreRepository();
        String prodName = "prodName";
        try {
            storeRepository.addNewProduct(new Product(1,prodName,"prodCat1",10));
            storeRepository.addNewProduct(new Product(2,"prodName2","prodCat2",20));
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }
        if(storeRepository.stockSituationProduct(prodName).size()!=1){
            assert false;
        }
    }
    @Test
    public void StockSituationProductNOTFound() {
        StoreRepository storeRepository = new StoreRepository();
        String prodName = "prodName";
        try {
            storeRepository.addNewProduct(new Product(1,"prodName1","prodCat1",10));
            storeRepository.addNewProduct(new Product(2,"prodName2","prodCat2",20));
        } catch (IOException e) {
            e.printStackTrace();
            assert false;
        }
        if(storeRepository.stockSituationProduct(prodName).size()!=0){
            assert false;
        }
    }
}

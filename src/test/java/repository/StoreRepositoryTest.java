package repository;

import controller.StoreController;
import model.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreRepositoryTest {

    @Test
    public void AddNewProductCodePostiveInteger() {
        StoreController c =new StoreController();
        int code1 = 5, code2 = 10, code3 = 1050;
        try{
            Product p1 = new Product(code1, "ananas", "aliment",20);
            Product p2 = new Product(code2, "kiwi", "aliment",30);
            Product p3 = new Product(code3, "mango", "aliment",20);
            c.addProduct(p1);
            c.addProduct(p2);
            c.addProduct(p3);
        } catch(Exception e) {
            assert false;
        }
    }
    @Test
    public void AddNewProductCodeEquals0() {
        int code1 = 0;
        try{
            StoreController c = new StoreController();
            Product p1 = new Product(code1, "ananas", "aliment",20);
            c.addProduct(p1);
            if(c.getStoreRepository().getAllProducts().contains(p1)){
                assert false;
            }
        } catch(Exception e){
            assert true;
        }
    }
    @Test
    public void AddNewProductCodeNegativeInteger() {
        int code1 = -100;
        try{
            StoreController c =new StoreController();
            Product p1 = new Product(code1, "ananas", "aliment",20);
            c.addProduct(p1);
            if(c.getStoreRepository().getAllProducts().contains(p1)){
                assert false;
            }
        } catch(Exception e){
            assert true;
        }
    }
}
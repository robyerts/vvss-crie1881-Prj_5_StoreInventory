package repository;

import model.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreRepositoryTest {

    @Test
    public void AddNewProductCodePostiveNaturalNr() {
        StoreRepository repo = new StoreRepository();
        int code1 = 5, code2 = 10, code3 = 1050;
        try{
            Product p1 = new Product(code1, "ananas", "aliment",20);
            Product p2 = new Product(code2, "kiwi", "aliment",30);
            Product p3 = new Product(code3, "mango", "aliment",20);
            repo.addNewProduct(p1);
            repo.addNewProduct(p2);
            repo.addNewProduct(p3);
            assert repo.getAllProducts().contains(p1);
            assert repo.getAllProducts().contains(p2);
            assert repo.getAllProducts().contains(p3);
        } catch(Exception e) {
            assert false;
        }
    }
    @Test
    public void AddNewProductCodeEquals0() {
        int code1 = 0;
        try{
            Product p1 = new Product(code1, "ananas", "aliment",20);
            StoreRepository repo = new StoreRepository();
            repo.addNewProduct(p1);
            assert false;
        } catch(Exception e){
            assert true;
        }
    }
    @Test
    public void AddNewProductCodeNegativeInteger() {
        int code1 = -100;
        try{
            Product p1 = new Product(code1, "ananas", "aliment",20);
            StoreRepository repo = new StoreRepository();
            repo.addNewProduct(p1);
            assert false;
        } catch(Exception e){
            assert true;
        }
    }
}
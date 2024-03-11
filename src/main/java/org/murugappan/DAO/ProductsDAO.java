package org.murugappan.DAO;

public interface ProductsDAO {
    void addProducts(String productname,int price,int stock);
    void deleteProduct(int productid);

}

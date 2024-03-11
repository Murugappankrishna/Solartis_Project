package org.murugappan.service;
import org.murugappan.DAO.ProductsDAO;
import org.murugappan.DAO.ProductsImpl;
import org.murugappan.model.ProductDetails;

import java.util.Scanner;

public class ProductsService {
    ProductDetails pd=new ProductDetails();
    ProductsDAO pdi=new ProductsImpl();
    Scanner ip = new Scanner(System.in);
    public void addProduct(){


        System.out.println("Enter The Product Name");
        pd.productdetails.put("ProductName",ip.next());
        System.out.println("Enter The Price");
        pd.productdetails.put("Price",ip.next());
        System.out.println("Enter The StockNo");
        pd.productdetails.put("Stock", ip.next());
        pdi.addProducts(pd.productdetails.get("ProductName"),Integer.parseInt(pd.productdetails.get("Price")),Integer.parseInt(pd.productdetails.get("Stock")));

    }
    public void deleteProduct(){
        System.out.println("Enter The ProductId To Be Deleted");
        int produuctid= ip.nextInt();
        pdi.deleteProduct(produuctid);
    }
}

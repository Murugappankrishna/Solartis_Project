package org.murugappan.DAO;

import org.murugappan.repo.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductsImpl implements ProductsDAO {
    JDBC jdbc=new JDBC();
    Connection con= jdbc.establishConnection();
    PreparedStatement preparedStatement;

    @Override
    public void addProducts(String productname,int price,int stock) {

        try {
            preparedStatement = con.prepareStatement("INSERT INTO Product_Info (Product_Name, Price, Stock) VALUES (?,?,?)");
            preparedStatement.setString(1,productname);
            preparedStatement.setInt(2,price);
            preparedStatement.setInt(3,stock);
            int rowsInserted = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {

            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }
    }

    @Override
    public void deleteProduct(int productid) {
        try {
            preparedStatement = con.prepareStatement("DELETE FROM Product_Info WHERE Product_ID = ?");
            preparedStatement.setInt(1,productid);
            int rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

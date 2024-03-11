package org.murugappan.DAO;

import org.murugappan.repo.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductsDAOImpl implements ProductsDAO {
    JDBC jdbc=new JDBC();
    Connection con= jdbc.establishConnection();

    @Override
    public void addProducts(String productname,int price,int stock) {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = con.prepareStatement("INSERT INTO Product_Info (Product_Name, Price, Stock) VALUES (?,?,?)");
            preparedStatement.setString(1,productname);
            preparedStatement.setDouble(2,price);
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

    }
}

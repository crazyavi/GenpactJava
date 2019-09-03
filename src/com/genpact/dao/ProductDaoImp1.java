package com.genpact.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.genpact.model.Product;
import com.genpact.util.jdbcConnection;

public class ProductDaoImp1 implements ProductDao {

	public boolean insertProduct(Product product) {
		Connection con = null;
		con = jdbcConnection.getConnection();
		PreparedStatement ps = null;
		String Query="insert into product values(?,?,?)"; 
		try {
			 ps = con.prepareStatement(Query);
			 ps.setInt(1, product.getPno());
			 ps.setString(2, product.getPname());
			 ps.setInt(3, product.getPrice());
			 int rs = ps.executeUpdate();
			 System.out.println(rs);
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}

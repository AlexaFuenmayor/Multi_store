package com.multitiendaheizel.ecommerce_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class EcommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
		String url = "jdbc:mysql://localhost:3306/store?serverTimezone=UTC";
		String username = "root";
		String password = "1234";

		try {
			Connection  connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

			while (resultSet.next()) {
				System.out.println(resultSet.getString("id")+ " | " + resultSet.getString("name") + " | " + resultSet.getString("email")+ " | " + resultSet.getString("phone"));
			}
			connection.close();
			statement.close();
			resultSet.close();

		}catch (SQLException e){
			e.printStackTrace();

		}
	}


}

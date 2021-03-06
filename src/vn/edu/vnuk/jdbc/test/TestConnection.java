package vn.edu.vnuk.jdbc.test;

import java.sql.Connection;
import vn.edu.vnuk.jdbc.ConnectionFactory;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Connection is open!");
			connection.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Done!");
		}
	}
}

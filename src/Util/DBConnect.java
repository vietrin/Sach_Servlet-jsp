package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public Connection getConnect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return 	DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QlSach", "sa", "123456");
		} catch (Exception ex) {
			System.out.print(ex);
		}
		return null;
	}
	public static void main(String[] arhs) {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QlSach", "sa", "123456");
			System.out.print(con);
		} catch (Exception ex) {
			System.out.print(ex);
		}
		
	}
}

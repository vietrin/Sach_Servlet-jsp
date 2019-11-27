package view;

import java.sql.Connection;

import Bo.SachBo;
import Util.DBConnect;

public class test {
	public static void main (String[] args ) {
		SachBo sachbo= new SachBo();
		Connection con =null;
		DBConnect db = new DBConnect();
		con=db.getConnect();
		System.out.print("chuoi :"+ sachbo.getList(con).size());
		
		
	}
}

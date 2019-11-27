package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.SachBean;
import Util.DBConnect;


public class SachDao {
	ResultSet rs =null ;
	PreparedStatement pst= null;
	DBConnect db=null;
	Statement st= null;
	SachBean sach= new SachBean();
	ArrayList<SachBean> list= new ArrayList<SachBean>();
	public ArrayList<SachBean> getList(Connection con){
		String sql="select * from sach";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				sach= new SachBean(rs.getString(1), rs.getString(2),rs.getInt(3),rs.getInt(4), rs.getString(5),rs.getString(6),rs.getString(7), rs.getString(8),rs.getString(9) );
				list.add(sach);
			}
			return list;
		}catch (Exception e) {
			System.out.print(e);
		}
		return null;
	}
}

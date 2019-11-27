package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.KhachHangBean;
import Bean.SachBean;
import Util.DBConnect;

public class KhachHangDao {
	ResultSet rs =null ;
	PreparedStatement pst= null;
	DBConnect db=null;
	Statement st= null;
	KhachHangBean khachhang= new KhachHangBean();
	ArrayList<KhachHangBean> list= new ArrayList<KhachHangBean>();
	public ArrayList<KhachHangBean> getList(Connection con){
		String sql="select * from khachhang";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				khachhang= new KhachHangBean(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7));
				list.add(khachhang);
			}
			return list;
		}catch (Exception e) {
			System.out.print(e);
		}
		return null;
	}
}

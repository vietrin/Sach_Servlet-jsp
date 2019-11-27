package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.HoaDonBean;
import Util.DBConnect;

public class HoaDonDao {
	ResultSet rs =null ;
	PreparedStatement pst= null;
	DBConnect db=null;
	Statement st= null;
	HoaDonBean hoadon= new HoaDonBean();
	ArrayList<HoaDonBean> list= new ArrayList<HoaDonBean>();
	public ArrayList<HoaDonBean> getList(Connection con){
		String sql="select * from sach";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				hoadon= new HoaDonBean(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getBoolean(4));
				list.add(hoadon);
			}
			return list;
		}catch (Exception e) {
			System.out.print(e);
		}
		return null;
	}
}

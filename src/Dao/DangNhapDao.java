package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.DangNhapBean;
import Util.DBConnect;

public class DangNhapDao {
	ResultSet rs =null ;
	PreparedStatement pst= null;
	DBConnect db=null;
	Statement st= null;
	DangNhapBean Dangnhap= new DangNhapBean();
	ArrayList<DangNhapBean> list= new ArrayList<DangNhapBean>();
	public ArrayList<DangNhapBean> getList(Connection con){
		String sql="select * from DangNhap";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				Dangnhap= new DangNhapBean(rs.getString(1),rs.getString(2),rs.getBoolean(3) );
				list.add(Dangnhap);
			}
			return list;
		}catch (Exception e) {
			System.out.print(e);
		}
		return null;
	}
	public boolean checkLogin(String user , String pass, ArrayList<DangNhapBean> list) {
		for (DangNhapBean dangnhap:list) {
			if (dangnhap.getTendangnhap().equals(user)==true && dangnhap.getMatkhau().equals(pass)==true){
				return true;
			}
		}
		return false;
	}
}

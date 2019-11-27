package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Bean.LoaiBean;
import Bean.SachBean;
import Util.DBConnect;

public class LoaiDao {
	ResultSet rs =null ;
	PreparedStatement pst= null;
	DBConnect db=null;
	Statement st= null;
	LoaiBean loai= new LoaiBean();
	ArrayList<LoaiBean> list= new ArrayList<LoaiBean>();
	public ArrayList<LoaiBean> getList(Connection con){
		String sql="select * from loai";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				loai= new LoaiBean(rs.getString(1), rs.getString(2));
				list.add(loai);
			}
			return list;
		}catch (Exception e) {
			System.out.print(e);
		}
		return null;
	}
}

package Bo;

import java.sql.Connection;
import java.util.ArrayList;

import Bean.KhachHangBean;
import Dao.KhachHangDao;

public class KhachHangBo {
	KhachHangDao khachhang= new KhachHangDao();
	public ArrayList<KhachHangBean> getList(Connection con) {
		return khachhang.getList(con);
	}
}

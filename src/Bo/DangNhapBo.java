package Bo;

import java.sql.Connection;
import java.util.ArrayList;

import Bean.DangNhapBean;
import Dao.DangNhapDao;

public class DangNhapBo {
	DangNhapDao dangnhap= new DangNhapDao();
	public ArrayList<DangNhapBean> getList(Connection con) {
		return dangnhap.getList(con);
	}
	public boolean checkLogin(String user, String pass ,ArrayList<DangNhapBean> list) {
		return dangnhap.checkLogin(user, pass, list);
	}
}

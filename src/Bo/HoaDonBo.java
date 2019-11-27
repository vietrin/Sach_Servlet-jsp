package Bo;

import java.sql.Connection;
import java.util.ArrayList;

import Bean.HoaDonBean;
import Dao.HoaDonDao;

public class HoaDonBo {
	HoaDonDao hoadon=new HoaDonDao();
	public ArrayList<HoaDonBean> getList(Connection con) {
		return hoadon.getList(con);
	}
}

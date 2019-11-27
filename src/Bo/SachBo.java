package Bo;

import java.sql.Connection;
import java.util.ArrayList;

import Bean.SachBean;
import Dao.SachDao;

public class SachBo {
	SachDao sach = new SachDao();
	public ArrayList<SachBean> getList(Connection con) {
		return sach.getList(con);
	}
}

package Bo;

import java.sql.Connection;
import java.util.ArrayList;

import Bean.LoaiBean;
import Dao.LoaiDao;

public class LoaiBo {
	LoaiDao loai = new LoaiDao();
	public ArrayList<LoaiBean> getList(Connection con) {
		return loai.getList(con);
	}
}

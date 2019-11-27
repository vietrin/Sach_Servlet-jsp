package Bo;

import java.util.ArrayList;

import Bean.GioHangBean;

public class GioHangBo {
	public ArrayList<GioHangBean> ds = new ArrayList<GioHangBean>();
	GioHangBean gh = new GioHangBean();

	public ArrayList<GioHangBean> them(String maSach, String tenSach, String anhbia, int gia, int soLuong,
			int thanhtien) {

		if (ds.size() != 0) {
					ds = muathem(maSach, ds);
			}
		else {
			gh = new GioHangBean(maSach, tenSach, anhbia, soLuong, gia, thanhtien);
			ds.add(gh);
		}

		return ds;
	}

	public GioHangBean muathem(String masach, String tenSach, String anhbia, int gia, int soLuong, int thanhtien,
			ArrayList<GioHangBean> list) {
		for (GioHangBean s : list) 
			if (s.getMasach().equals(masach)==false) 
				gh = new GioHangBean(s.getMasach(), s.getTensach(), s.getAnhbia(), s.getSoluong(), s.getGiaban(),
						s.getThanhtien());	
		return gh;
	}

	public ArrayList<GioHangBean> muathem(String masach, ArrayList<GioHangBean> list) {
		ArrayList<GioHangBean> ds = new ArrayList<GioHangBean>();
		for (GioHangBean s : list) {
			if (s.getMasach().equals(masach)) {
				s.setSoluong(s.getSoluong() + 1);
				s.setThanhtien();

			}
			gh = new GioHangBean(s.getMasach(), s.getTensach(), s.getAnhbia(), s.getSoluong(), s.getGiaban(),
					s.getThanhtien());
			ds.add(gh);
		}
		return ds;
	}

	public boolean sua(String maSach, int soLuong, ArrayList<GioHangBean> ds) {
		for (GioHangBean g : ds) {
			if (g.getMasach().equals(maSach)) {
				g.setSoluong(soLuong);
				g.setThanhtien();
				return true;
			}
		}
		return false;
	}

	public ArrayList<GioHangBean> xoa(String maSach, ArrayList<GioHangBean> ds) {
		ArrayList<GioHangBean> list = new ArrayList<GioHangBean>();
		int i = 1;
		for (GioHangBean g : ds) {

			if (g.getMasach().equals(maSach) == false) {
				list.add(ds.get(i));
			}
			i++;
		}
		return list;
	}

	public int tongtien(ArrayList<GioHangBean> list) {
		int sum = 0;
		for (GioHangBean ds : list)
			sum += ds.getThanhtien();
		return sum;
	}
}

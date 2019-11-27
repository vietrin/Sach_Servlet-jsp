package Bean;

public class GioHangBean {
	private String masach,tensach,anhbia;
	private int soluong,giaban, thanhtien;
	
	
	public int getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien() {
		this.thanhtien = this.giaban*this.soluong;
	}
	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	public GioHangBean() {
		// TODO Auto-generated constructor stub
	}
	public GioHangBean(String masach, String tensach, String anhbia, int soluong, int giaban ,int thanhtien) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.anhbia = anhbia;
		this.soluong = soluong;
		this.giaban = giaban;
		this.thanhtien=thanhtien;
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public String getAnhbia() {
		return anhbia;
	}
	public void setAnhbia(String anhbia) {
		this.anhbia = anhbia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}
	
}

package Bean;

public class HoaDonBean {
	private int mahoadon,makh;
	private String ngaymua;
	private Boolean damua;
	
	
	public HoaDonBean() {
		super();
	}
	public HoaDonBean(int mahoadon, int makh, String ngaymua, Boolean damua) {
		super();
		this.mahoadon = mahoadon;
		this.makh = makh;
		this.ngaymua = ngaymua;
		this.damua = damua;
	}
	public int getMahoadon() {
		return mahoadon;
	}
	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}
	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
		this.makh = makh;
	}
	public String getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(String ngaymua) {
		this.ngaymua = ngaymua;
	}
	public Boolean getDamua() {
		return damua;
	}
	public void setDamua(Boolean damua) {
		this.damua = damua;
	}
	
}

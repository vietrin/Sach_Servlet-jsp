package Bean;

public class DangNhapBean {
	private String tendangnhap,matkhau;
	private Boolean quyendn;
	
	public DangNhapBean(String tendangnhap, String matkhau, Boolean quyendn) {
		super();
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		this.quyendn = quyendn;
	}
	public DangNhapBean() {
		// TODO Auto-generated constructor stub
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public Boolean getQuyendn() {
		return quyendn;
	}
	public void setQuyendn(Boolean quyendn) {
		this.quyendn = quyendn;
	}
	
}

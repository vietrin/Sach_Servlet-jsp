package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DangKyController
 */
@WebServlet("/Dang-ky")
public class DangKyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenkh=request.getParameter("HotenKH");
		String tendn=request.getParameter("TenDN");
		String matkhau=request.getParameter("Matkhau");
		String matkhaunhaplai=request.getParameter("Matkhaunhatrlai");
		String email=request.getParameter("Email");
		String diachi=request.getParameter("Diachi");
		String sdt=request.getParameter("Dienthoai");
		String ngaysinh =request.getParameter("Ngaysinh");
		if (tenkh != null && tendn != null && matkhau != null && matkhaunhaplai !=null && diachi != null && sdt !=null && ngaysinh !=null&& email !=null) {
			
		}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("DangKy.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}

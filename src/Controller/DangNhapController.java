package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.DangNhapBean;
import Bo.DangNhapBo;
import Util.DBConnect;

/**
 * Servlet implementation class DangNhapController
 */
@WebServlet("/Dang-nhap")
public class DangNhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	DBConnect db = new DBConnect();
	DangNhapBo dangnhap= new DangNhapBo();
    ArrayList<DangNhapBean> list= new ArrayList<DangNhapBean>();
   
    public DangNhapController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String user= (String) request.getParameter("username");
		String pass=(String) request.getParameter("password");
		if(user!=null && pass!=null) {
			con=db.getConnect();
			list=dangnhap.getList(con);
			if (dangnhap.checkLogin(user, pass, list)== true){
				session.setAttribute("account", user);
				response.sendRedirect("Trang-chu");
			}
			request.setAttribute("error","Đăng nhập không hợp lệ ! xin vui lòng thử lại");
		}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("DangNhap.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}

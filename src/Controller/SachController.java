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

import Bean.SachBean;
import Bo.SachBo;
import Util.DBConnect;

/**
 * Servlet implementation class SachController
 */
@WebServlet("/Trang-chu")
public class SachController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	DBConnect db = new DBConnect();
	SachBo sachbo = new SachBo();
	ArrayList<SachBean> list= new ArrayList<SachBean>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SachController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		con=db.getConnect();
		list=sachbo.getList(con);
		if (list != null) {
			request.setAttribute("size",list.size());
			request.setAttribute("list", list);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */


}

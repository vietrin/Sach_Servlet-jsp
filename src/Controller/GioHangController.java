package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.GioHangBean;
import Bo.GioHangBo;

/**
 * Servlet implementation class GioHangController
 */
@WebServlet("/Gio-hang")
public class GioHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GioHangBo bo = new GioHangBo();
	ArrayList<GioHangBean> list = new ArrayList<GioHangBean>();

	public GioHangController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String masach = request.getParameter("masach");
		String tenSach = request.getParameter("tensach");
		String anhbia = request.getParameter("anhbia");
		String giatam = request.getParameter("gia");
		HttpSession session = request.getSession();
		if (masach != null && tenSach != null && anhbia != null && giatam != null) {
			int gia = Integer.parseInt(giatam);
			int soluong = 1;
			list = bo.them(masach, tenSach, anhbia, gia, soluong, gia * soluong);
			int thanhtien = bo.tongtien(list);
			session.setAttribute("gio", list.size());
			session.setAttribute("thanhtien", thanhtien);
			session.setAttribute("SachDaMua", list);
			response.sendRedirect("Gio-hang");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("GioHang.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	String action = (String) request.getParameter("action");
		String masach = (String) request.getParameter("ms2");
		int soluong = Integer.parseInt(request.getParameter("txtSoluong"));
		HttpSession session = request.getSession();
		if (bo.sua(masach, soluong, list)) {
			int thanhtien = bo.tongtien(list);
			for (GioHangBean ds : list)
				System.out.println("danh sach sach sau khi cap nhap :" + ds.getMasach() + " " + ds.getTensach() + " "
						+ ds.getSoluong());
			session.setAttribute("thanhtien", thanhtien);
			session.setAttribute("SachDaMua", list);
			response.sendRedirect("Gio-hang");
		} else {
		RequestDispatcher rd = request.getRequestDispatcher("GioHang.jsp");
		rd.forward(request, response);
		}
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		super.doDelete(req, resp);
	}
	

}

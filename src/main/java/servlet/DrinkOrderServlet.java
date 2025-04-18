package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DrinkOrder;
@WebServlet("/DrinkOrder")
public class DrinkOrderServlet extends HttpServlet {

	public DrinkOrderServlet() {
		// TODO 自動產生的建構子 Stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String type=req.getParameter("type");
		String size=req.getParameter("size");
		String ice=req.getParameter("ice");
		if(type==null||size==null||ice==null) {
			resp.getWriter().print("參數輸入錯誤");
			return;
			}
		DrinkOrder drinkOrder=new DrinkOrder(type,size,ice);
		RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/drink_order.jsp");
		req.setAttribute("drinkOrder",drinkOrder );
		rd.forward(req, resp);
	}

}

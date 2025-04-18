package servlet;

import java.io.IOException;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/lottery")
public class LotteryServlet extends HttpServlet{

	public LotteryServlet() {
		// TODO 自動產生的建構子 Stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.生成樂透號碼
		Random random=new Random();
		Set <Integer> numbers =new TreeSet<>();
		while(numbers.size()<5) {
			int number=random.nextInt(39)+1;
			numbers.add(number);
		}
		//透過resp將資料顯示在瀏覽器 resp.getWriter().print(numbers);
		//2.生成調度器
		RequestDispatcher rd= req.getRequestDispatcher("/lottery.jsp");
		//3.傳遞樂透號碼
		req.setAttribute("numbers",numbers);
		rd.forward(req, resp);
	}
	

}

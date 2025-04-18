package servlet;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//表示瀏覽器可以透過http://localhost:8080/JavaWeb/Hello 網址執行到此Servlet程式
//@WebServlet("/Hello") 精簡寫法
//@WebServlet(urlPatterns="/Hello") 最標準
@WebServlet(urlPatterns={"/Hello","/aaa"})
public class HelloServlet extends HttpServlet {

	public HelloServlet() {
		// TODO 自動產生的建構子 Stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello JavaServlet");
	}

}

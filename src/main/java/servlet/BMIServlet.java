package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/bmi")
public class BMIServlet extends HttpServlet{
	public BMIServlet() {
		// TODO 自動產生的建構子 Stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String height=req.getParameter("h");
		String weight=req.getParameter("w");
		if(!(isDouble(height)&&isDouble(weight))) {
			resp.getWriter().print("身高輸入錯誤");
			return ;
		} 
		double h=Double.parseDouble(height);
		double w=Double.parseDouble(weight);
		double BMI=getBMI(h,w);
		
		
		if(BMI<=18) {
			resp.getWriter().print("BMI: "+BMI+",體重過輕");
		}else if(BMI<23) {
			resp.getWriter().print("BMI: "+BMI+",體重正常");
		}else if(BMI>23) {
			resp.getWriter().print("BMI: "+BMI+",體重過重");
		}
		

	}
	private double getBMI(double h,double w) {
		return w / Math.pow(h/100, 2);
	}
	private boolean isDouble(String data) {
		try {
			Double.parseDouble(data);
			return  true;
		}catch(Exception e){
			return  false;
		}
	} 
}

package com.iot;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CoCAPServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String num=req.getParameter("num");
//		String ipcoap=req.getParameter("ip");
		String ipcoap="localhost";
		String res=new CoAPClient().getFib(ipcoap,num);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Fibonacci("+num+") = "+res);
	}
}

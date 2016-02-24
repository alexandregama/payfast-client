package br.com.payfast.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.ClientBuilder;

@WebServlet("/payment-servlet")
public class PaymentResourceServlet extends HttpServlet {

	private static final long serialVersionUID = 2790585176407609371L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Payment payment = ClientBuilder.newClient()
				.target("http://127.0.0.1:8080/payfast/payments/1")
				.request()
				.get(Payment.class);
		
		System.out.println(payment.getId());
	}
}

package br.com.payfast.client;

import static org.junit.Assert.*;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Test;

public class PaymentResourceTest {

	@Test
	public void shouldRetrieveAnUserByItsId() throws Exception {
		Payment payment = ClientBuilder.newClient()
			.target("http://127.0.0.1:8080/payfast/payments/1")
			.request()
			.accept("application/json")
			.get(Payment.class);
		
		assertEquals(1L, payment.getId(), 0);
	}
	
}

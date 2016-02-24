package br.com.payfast.client;

import static org.junit.Assert.*;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Test;

public class UserResourceTest {

	@Test
	public void shouldReturnAnUserByItsId() throws Exception {
		User user = ClientBuilder.newClient()
			.target("http://127.0.0.1:8080/payfast/users/1")
			.request()
			.get(User.class);
		
		assertEquals(1L, user.getId(), 0);
	}
}

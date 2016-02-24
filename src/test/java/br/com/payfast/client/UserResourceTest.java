package br.com.payfast.client;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import org.junit.Test;

public class UserResourceTest {

	@Test
	public void shouldSaveANewUser() throws Exception {
		User user = new User(6L, "Gustavo Silva");
		
		User savedUser = ClientBuilder.newClient()
			.target("http://localhost:8080/payfast/users")
			.request()
			.buildPost(Entity.json(user))
			.invoke(User.class);
		
		assertEquals("Gustavo Silva", savedUser.getName());
	}
	
}

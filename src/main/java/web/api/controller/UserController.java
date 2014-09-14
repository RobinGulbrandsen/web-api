package web.api.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import web.api.domain.User;

@Path("/users")
public class UserController {

	@GET
	@Produces("application/json")
	public ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Scott", "Tiger"));
		users.add(new User("Robin", "1234"));
		return users;
	}
}

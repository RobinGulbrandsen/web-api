package web.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import web.api.domain.User;

@Path("/users")
public class UserController {

	@GET
	@Produces("application/json")
	public List<User> getUsers() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pUnit");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT u FROM User u", User.class);
        return q.getResultList();
        
	}
}

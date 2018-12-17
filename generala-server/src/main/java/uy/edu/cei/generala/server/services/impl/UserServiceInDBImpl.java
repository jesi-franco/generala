package uy.edu.cei.generala.server.services.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import uy.edu.cei.generala.domain.UserModel;
import uy.edu.cei.generala.server.services.UserService;

public class UserServiceInDBImpl implements UserService {

	private static UserServiceInDBImpl instance;

	private EntityManagerFactory emf;
	private EntityManager em;

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public static void setInstance(UserServiceInDBImpl instance) {
		UserServiceInDBImpl.instance = instance;
	}

	
	static {
		UserServiceInDBImpl.instance = new UserServiceInDBImpl();
	}

	public static UserService getInstance() {
		return UserServiceInDBImpl.instance;
	}

	private UserServiceInDBImpl() {
		this.emf = Persistence.createEntityManagerFactory("jpaDS");
		this.em = emf.createEntityManager();
	}

	@Override
	public UserModel findUserByUsername(String username, String password) {
		UserModel user = null;
		em.getTransaction().begin();
		TypedQuery<UserModel> query  = em.createNamedQuery("UserModel.login", UserModel.class)
		.setParameter("username", username)
		.setParameter("password", password);
		em.getTransaction().commit();		
		return user;
	}

	/*@Override
	public UserModel findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}*/
}


package uy.edu.cei.generala.server.services.impl;

import java.util.Map;
import java.util.TreeMap;

import uy.edu.cei.generala.domain.UserModel;
import uy.edu.cei.generala.server.services.UserService;

public class UserServiceInMemoryImpl implements UserService {

	private static UserServiceInMemoryImpl instance;

	static {
		UserServiceInMemoryImpl.instance = new UserServiceInMemoryImpl();
	}

	public static UserService getInstance() {
		return UserServiceInMemoryImpl.instance;
	}

	private Map<String, UserModel> users;

	private UserServiceInMemoryImpl() {
		this.users = new TreeMap<>();

		users.put("pepe", new UserModel("pepe", "password","pepe","unemail"));
		users.put("juan", new UserModel("juan", "password","juan","unemail"));
		users.put("jose", new UserModel("jose", "password","jose","unemail"));
		users.put("Admin", new UserModel("admin","admin","admin","unemail"));
				
	}

	@Override
	public UserModel findUserByUsername(String username,String password) {
		return this.users.get(username);
	}

}

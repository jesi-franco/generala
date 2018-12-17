package uy.edu.cei.generala.server.services;

import uy.edu.cei.generala.domain.UserModel;
import uy.edu.cei.generala.server.services.impl.UserServiceInDBImpl;
import uy.edu.cei.generala.server.services.impl.UserServiceInMemoryImpl;

public interface UserService {

	public static final String TYPE = "database";

	public static UserService userServiceFactory() {
		UserService userService = null;
		if ("memory".equals(TYPE)) {
			userService = UserServiceInMemoryImpl.getInstance();
		} else if("database".equals(TYPE)) {
			userService = UserServiceInDBImpl.getInstance();
			// retorno implementacion en base de datos
			userService = UserServiceInDBImpl.getInstance();
		
		}
		return userService;
	}

	/**
	 * Una descripcion muy linda de lo que hace el metodo
	 * 
	 * @param username
	 * @return Un usuario si hay uno con ese username, si no, retorna null
	 */
	public UserModel findUserByUsername(String username,String password);


}

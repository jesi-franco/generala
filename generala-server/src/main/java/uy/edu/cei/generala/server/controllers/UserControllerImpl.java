package uy.edu.cei.generala.server.controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import uy.edu.cei.generala.common.client.Observer;
import uy.edu.cei.generala.common.notifications.GameNotification;
import uy.edu.cei.generala.common.notifications.GameNotificationType;
import uy.edu.cei.generala.common.server.controllers.UserController;
import uy.edu.cei.generala.domain.UserModel;
import uy.edu.cei.generala.server.services.UserService;
import uy.edu.cei.generala.server.services.impl.UserServiceInDBImpl;
import uy.edu.cei.generala.server.services.impl.UserServiceInMemoryImpl;

public class UserControllerImpl extends UnicastRemoteObject implements UserController {

	/**
	 * Default UID
	 */
	private static final long serialVersionUID = 1L;
	private UserService userservice;
	private List<Observer> observers;
	
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public UserControllerImpl(List<Observer> observers) throws RemoteException {
		this.observers = observers;
		this.userservice= UserServiceInDBImpl.getInstance();
	}

	@Override
	public UserModel login(String username, String password) throws RemoteException {
		//System.out.println(String.format("username: %s, password: %s", username, password));
		
		UserService us = UserService.userServiceFactory();
		UserModel userModel = us.findUserByUsername(username, password);
		if(userModel != null && 
				userModel.getPassword().equals(password)) {
			this.observers.forEach(o -> {
				try {
					
					GameNotification gameNotification = 
							new GameNotification();
					
					gameNotification.setTargetUser(userModel);
					gameNotification.setType(
							GameNotificationType.LOGIN);
					
					o.update(gameNotification);
					
				} catch (RemoteException e) {
					e.printStackTrace();
				}
			});
			return userModel;
		}
		
		return null;
	}

	
}

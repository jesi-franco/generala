package uy.edu.cei.generala.server;

import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

import uy.edu.cei.generala.common.client.Observer;
import uy.edu.cei.generala.common.server.Server;
import uy.edu.cei.generala.common.server.controllers.RoomControllerS;
import uy.edu.cei.generala.common.server.controllers.TableController;
import uy.edu.cei.generala.common.server.controllers.UserController;
import uy.edu.cei.generala.server.controllers.RoomControlerImpl;
import uy.edu.cei.generala.server.controllers.TableControllerImpl;
import uy.edu.cei.generala.server.controllers.UserControllerImpl;

public class ServerImpl implements Server {

	private UserController userController;
	private LinkedList<Observer> observers;
	private RoomControlerImpl roomController;
	private TableControllerImpl tableController;

	public ServerImpl() throws RemoteException {
		this.observers = new LinkedList<>();
		this.roomController = new RoomControlerImpl (observers);
		this.tableController = new TableControllerImpl (observers);
		this.userController = new UserControllerImpl(observers);
		
	}

	@Override
	public void testConnection() throws RemoteException {
		System.out.println("Conectado exitosamente");
	}

	@Override
	public UserController getUserController() throws RemoteException {
		return this.userController;
	}
	
	
	@Override
	public TableController getTableController() throws RemoteException {
		return this.tableController;
	}
	
	@Override
	public RoomControllerS getRoomController() throws RemoteException {
		return this.roomController;
	}
	
	
	@Override
	public void register(Observer observer) throws RemoteException {
		this.observers.add(observer);
	}

}

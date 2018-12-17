package uy.edu.cei.generala.server.controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

import uy.edu.cei.generala.common.server.controllers.TableController;
import uy.edu.cei.generala.domain.Die;

public class TableControllerImpl extends UnicastRemoteObject implements TableController {

	private static final long serialVersionUID = 1L;

	

	@Override
	public LinkedList<Die> getDice() throws RemoteException {
	
		return null;
	}
	public TableControllerImpl() throws RemoteException {
		super();
		
	}
}

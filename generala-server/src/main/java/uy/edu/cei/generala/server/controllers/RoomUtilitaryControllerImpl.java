package uy.edu.cei.generala.server.controllers;

import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.Observer;

import uy.edu.cei.generala.domain.Room;

public class RoomUtilitaryControllerImpl {
	private LinkedList<Observer> observers;
	public LinkedList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(LinkedList<Observer> observers) {
		this.observers = observers;
	}
	
	public void setRooms(LinkedList<Room> rooms) {
		this.rooms = rooms;
	}
	private LinkedList<Room> rooms;
	
	public RoomUtilitaryControllerImpl(LinkedList<Observer> observers) throws RemoteException {
		this.observers = observers;
		this.rooms = new LinkedList<>();
	}
	
	public LinkedList<Room> getRooms() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}

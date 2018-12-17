package uy.edu.cei.generala.server.controllers;
import java.util.List;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.Observer;

import javax.persistence.Table;

import uy.edu.cei.generala.common.server.controllers.RoomControllerS;
import uy.edu.cei.generala.domain.PlayerOnline;
import uy.edu.cei.generala.domain.Room;
import uy.edu.cei.generala.domain.UserModel;

public class RoomControlerImpl extends UnicastRemoteObject implements RoomControllerS{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Observer> observers;
	private List<Table> tables;
	
	
	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	
	
	
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	private List<Room> rooms;

	public RoomControlerImpl(List<Observer> observers) throws RemoteException {
		this.observers = observers;
		this.tables = new LinkedList<>();
		
	}

	private void initialize() throws RemoteException {

	}

	public List<Room> getRooms() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	

		@Override
		public PlayerOnline goToTable(Table table, UserModel user) throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Table checkTableAvaible() throws RemoteException {
			Table t = null;

			if (!this.tables.isEmpty()) {
				for (Table table : this.tables) {
					if (table.getPlayers().size()==1||table.getPlayers().size()==0) {
						t = table;
					}
				}
			}

			return t;
		}
		}
		




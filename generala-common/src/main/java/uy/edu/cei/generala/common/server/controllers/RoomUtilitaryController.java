package uy.edu.cei.generala.common.server.controllers;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;

import uy.edu.cei.generala.domain.Room;

public interface RoomUtilitaryController extends Remote{
	public LinkedList<Room> getRooms() throws RemoteException;
}

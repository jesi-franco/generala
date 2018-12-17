package uy.edu.cei.generala.common.server.controllers;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.persistence.Table;

import uy.edu.cei.generala.domain.PlayerOnline;
import uy.edu.cei.generala.domain.UserModel;

public interface RoomControllerS extends Remote{
	public PlayerOnline goToTable(Table table, UserModel user) throws RemoteException;
	public Table checkTableAvaible() throws RemoteException;
}

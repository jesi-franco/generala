package uy.edu.cei.generala.common.server.controllers;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;

import uy.edu.cei.generala.domain.Die;

public interface TableController extends Remote{
	public LinkedList<Die> getDice() throws RemoteException;
}

package uy.edu.cei.generala.domain;

import java.io.Serializable;
import java.rmi.Remote;


public class PlayerOnline implements Serializable, Remote {

	private static final long serialVersionUID = 1L;
	
	private UserModel user;
	private GameBoard gameBoard;
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public GameBoard getBoard() {
		return gameBoard;
	}
	public void setBoard(GameBoard board) {
		this.gameBoard = board;
	}
	
}

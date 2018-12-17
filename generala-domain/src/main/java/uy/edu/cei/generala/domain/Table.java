package uy.edu.cei.generala.domain;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.UUID;
import java.rmi.Remote;

public class Table implements Serializable, Remote {
	
	private static final long serialVersionUID = 1L;
	private LinkedList<Die> dice;
	private LinkedList<PlayerOnline> twoPlayers;
	
	
	private UUID id;
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LinkedList<PlayerOnline> getPlayers() {
		return twoPlayers;
	}

	public void setPlayers(LinkedList<PlayerOnline> twoPlayers) {
		this.twoPlayers = twoPlayers;
	}

	public LinkedList<Die> getDice() {
		return dice;
	}

	public void setDice(LinkedList<Die> dice) {
		this.dice = (LinkedList<Die>) dice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Table() {
		this.id = UUID.randomUUID();
		this.twoPlayers = new LinkedList<>();
		this.dice = new LinkedList<>();
	}
	
	public void newGamePlayer (PlayerOnline player) {
		this.twoPlayers.add(player);
	}
}

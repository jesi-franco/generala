package uy.edu.cei.generala.domain;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Room implements Serializable, Remote {

	
	private static final long serialVersionUID = 1L;
	//private static final List<Room> instances = null;
	private UUID id;
	private String name;
	private Integer chips;
	private LinkedList<Table> tables;

	
	public static Room createRooms(String t, Integer b) {
		Room room = new Room();
		room.id = UUID.randomUUID();
		room.tables = new LinkedList<>();
		room.name = t;
		room.chips = b;
		return room;

	}

	private Room() {
		
	}
	
	public static List<Room> getInstances() {
		return getInstances();
	}
	
	public void addTables(Table table) {
		this.tables.add(table);
	}

	
}

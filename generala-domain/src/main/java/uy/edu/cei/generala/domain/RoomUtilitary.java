package uy.edu.cei.generala.domain;
import java.util.LinkedList;
import java.io.Serializable;
import java.rmi.Remote;
import java.util.UUID;

public class RoomUtilitary implements Serializable, Remote {

	private static final long serialVersionUID = 1L;

	
	public RoomUtilitary() {
		this.totalRooms = new LinkedList<>();
		this.id = UUID.randomUUID();
		
	}
	private UUID id;
	
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LinkedList<Room> getRooms() {
		return totalRooms;
	}

	public void setRooms(LinkedList<Room> rooms) {
		this.totalRooms = rooms;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private LinkedList<Room> totalRooms;

}

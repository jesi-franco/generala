package uy.edu.cei.generala.domain;
import java.io.Serializable;
import java.rmi.Remote;



public class Die implements Serializable, Remote {

	private static final long serialVersionUID = 1L;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public Boolean getDieFree() {
		return dieFree;
	}


	public void setDieFree(Boolean dieFree) {
		this.dieFree = dieFree;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private long id;
	private int points;
	private Boolean dieFree;//disponibilidad de dados

	
	public Die() {
		this.points = 1;
		this.dieFree = true;
	}
}

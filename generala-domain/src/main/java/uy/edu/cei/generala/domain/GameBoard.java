package uy.edu.cei.generala.domain;

import java.io.Serializable;
import java.rmi.Remote;


public class GameBoard implements Serializable, Remote {


	private static final long serialVersionUID = 1L;
//jugadas posibles
	private int par;
	private int trio;
	private int poker;
	private int full;
	private int escaleraCorta;
	private int escaleraLarga;
	private int generala;
	private long id;
	private int sumaDeUno;
	private int sumaDeDos;
	private int sumaDeTres;
	private int sumaDeCuatro;
	private int sumaDeCinco;
	private int sumaDeSeis;
	private int comodin;
	
	public int getPar() {
		return par;
	}
	public void setPar(int par) {
		this.par = par;
	}
	public int getTrio() {
		return trio;
	}
	public void setTrio(int trio) {
		this.trio = trio;
	}
	public int getPoker() {
		return poker;
	}
	public void setPoker(int poker) {
		this.poker = poker;
	}
	public int getFull() {
		return full;
	}
	public void setFull(int full) {
		this.full = full;
	}
	public int getEscaleraCorta() {
		return escaleraCorta;
	}
	public void setEscaleraCorta(int escaleraCorta) {
		this.escaleraCorta = escaleraCorta;
	}
	public int getEscaleraLarga() {
		return escaleraLarga;
	}
	public void setEscaleraLarga(int escaleraLarga) {
		this.escaleraLarga = escaleraLarga;
	}
	public int getGenerala() {
		return generala;
	}
	public void setGenerala(int generala) {
		this.generala = generala;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSumaDeUno() {
		return sumaDeUno;
	}
	public void setSumaDeUno(int sumaDeUno) {
		this.sumaDeUno = sumaDeUno;
	}
	public int getSumaDeDos() {
		return sumaDeDos;
	}
	public void setSumaDeDos(int sumaDeDos) {
		this.sumaDeDos = sumaDeDos;
	}
	public int getSumaDeTres() {
		return sumaDeTres;
	}
	public void setSumaDeTres(int sumaDeTres) {
		this.sumaDeTres = sumaDeTres;
	}
	public int getSumaDeCuatro() {
		return sumaDeCuatro;
	}
	public void setSumaDeCuatro(int sumaDeCuatro) {
		this.sumaDeCuatro = sumaDeCuatro;
	}
	public int getSumaDeCinco() {
		return sumaDeCinco;
	}
	public void setSumaDeCinco(int sumaDeCinco) {
		this.sumaDeCinco = sumaDeCinco;
	}
	public int getSumaDeSeis() {
		return sumaDeSeis;
	}
	public void setSumaDeSeis(int sumaDeSeis) {
		this.sumaDeSeis = sumaDeSeis;
	}
	public int getComodin() {
		return comodin;
	}
	public void setComodin(int comodin) {
		this.comodin = comodin;
	}
	
}

package model;

import java.util.Date;

public class Vehiculo {
	private int idVehiculo;
	private int idLote;
	private String modelo;
	private String tipo;
	
	public Vehiculo(int idVehiculo, int idLote, String modelo, String tipo) {
		super();
		this.setIdVehiculo(idVehiculo);
		this.setIdLote(idLote);
		this.setModelo(modelo);
		this.setTipo(tipo);
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}
	
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdLote() {
		return idLote;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
}

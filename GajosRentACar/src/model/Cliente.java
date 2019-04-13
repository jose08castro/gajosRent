package model;

import java.util.Date;

public class Cliente {
	private int idEmpleado;
	private String nombre;
	private Date fechaNacimiento;
	
	public Cliente(int idEmpleado, String nombre, Date fechaNacimiento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
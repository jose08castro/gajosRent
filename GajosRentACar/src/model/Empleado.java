package model;

import java.util.Date;

public class Empleado {
	private int idEmpleado;
	private String nombre;
	private String usuario;
	private String contrasenna;
	private Date fechaNacimiento;
	private float salario;
	private String puesto;
	
	public Empleado(int idEmpleado, String nombre, String usuario, String contrasenna, Date fechaNacimiento,
			float salario, String puesto) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrasenna = contrasenna;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
		this.puesto = puesto;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
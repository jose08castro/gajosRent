package controller;

import model.Empleado;
import model.Cliente;

import java.text.ParseException;

import controller.EmpleadoController;

public class Main {
	public static void main(String[] args) throws ParseException {
		EmpleadoController empleadoController = new EmpleadoController();
		ClienteController clienteController = new ClienteController();
		VehiculoController vehiculoC = new VehiculoController();
		
		vehiculoC.crearVehiculo("cajero");
		//Empleado empleado = new Empleado(0, "Hola", null, null, null, 0, "administrador");
		//empleadoController.crearEmpleado(empleado.getPuesto());
		
		
	}
}
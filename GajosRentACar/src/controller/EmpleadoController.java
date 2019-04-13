package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Empleado;

public class EmpleadoController {
	
	public void crearEmpleado(String puesto) throws ParseException {
		Scanner reader = new Scanner(System.in);
		if(puesto=="administrador"){
			System.out.println("Ingrese el id Empleado: ");
			int idEmpleado = reader.nextInt();
			
			System.out.println("Ingrese el Nombre: ");
			reader.nextLine();
			String nombre = reader.nextLine();
			
			System.out.println("Ingrese el Usuario: ");
			String usuario = reader.nextLine();
			
			System.out.println("Ingrese el Contraseña: ");
			String contrasenna = reader.nextLine();
			
			System.out.println("Ingrese el Fecha Nacimiento: ");
			Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(reader.nextLine());
			
			System.out.println("Ingrese el Salario: ");
			float salario = reader.nextFloat();
			
			System.out.println("Ingrese el Puesto: ");
			reader.nextLine();
			String puesto1 = reader.nextLine();
			
			Empleado empleado = new Empleado(idEmpleado, nombre, usuario, contrasenna, fechaNacimiento, salario, puesto1);
		}
		else {System.out.print("Usuario no tiene permitida esta acción");
		}
	}

	public void eliminarUsuario(String nombre) throws ParseException {
	}
}
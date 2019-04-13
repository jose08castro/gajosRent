package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Cliente;

public class ClienteController {
	
	public void crearCliente(String puesto) throws ParseException {
		Scanner reader = new Scanner(System.in);
		if(puesto=="administrador" || puesto=="cajero" ){
			System.out.println("Ingrese el id Cliente: ");
			int idCliente = reader.nextInt();
			System.out.println("Ingrese el Nombre: ");
			reader.nextLine();
			String nombre = reader.nextLine();	
			System.out.println("Ingrese el Fecha Nacimiento: ");
			Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(reader.nextLine());
			Cliente cliente = new Cliente(idCliente, nombre, fechaNacimiento);
		}
		else {System.out.print("Usuario no tiene permitida esta acción");
		}
	}
}
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Vehiculo;

public class VehiculoController {
	
	public void crearVehiculo(String puesto) throws ParseException {
		Scanner reader = new Scanner(System.in);
		if(puesto=="administrador"){
			System.out.println("Ingrese el ID Vehiculo: ");
			int idVehiculo = reader.nextInt();
			
			System.out.println("Lote:");
			int idLote = reader.nextInt();
			
			System.out.println("Modelo:");
			reader.nextLine();
			String modelo = reader.nextLine();
			
			System.out.println("Tipo: ");
			String tipo = reader.nextLine();
			Vehiculo vehiculo = new Vehiculo(idVehiculo, idLote, modelo, tipo);
		}
		else {System.out.print("Usuario no tiene permitida esta acción");
		}
	}
}
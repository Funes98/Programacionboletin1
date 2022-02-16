package prueba;

import java.util.Scanner;

public class Aeropuerto {
	public static void main (String args []) {
		Avion av1 = new Avion("ryanair034",90);
		System.out.println("");
	}
	public static Avion ("crearAvionConMenu")
	
	int capacidad=0;
	Avion avionCreado = null;
	
	Scanner sc = new Scanner(System.in);
	int op = Integer.valueOf(sc.nextLine());
	
	int(op==1) {
		System.out.println("Introduzca el identificador del Avion: ");
		String identificador = sc.nextLine();
		System.out.println("Introduzca Capacidad del Avion: ");
		Capacidad = Integer.valueOf(sc.nextLine());
		
		avionCreado = new Avion(identificador, capacidad);
		
		
	}else if(op==2) {
		System.out.println("Introduzca el identificador del Avion: ");
		String identificador = sc.nextLine();
		System.out.println("Introduzca Capacidad del Avion: ");
		Capacidad = Integer.valueOf(sc.nextLine());
		System.out.println("Introduzca nombre de la Compañia: ")
		String compania = sc.nextLine();
		
		avionCreado = new Avion(identificador, capacidad, compania);
		
	}else  {
		System.out.println("La opcion selecionada no es correcta");
	}
	return avionCreado;

}

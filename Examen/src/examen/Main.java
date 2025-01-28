package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean end= false;
		while (!end) {
			System.out.println("Menú de opciones");
			System.out.println("1. Añadir alumno");
			System.out.println("2. Listar alumnos");
			System.out.println("3. Añadir nota");
			System.out.println("4. Eliminar nota");
			System.out.println("5. Mostrar detalles de alumno");
			System.out.println("6. Salir");
			
			System.out.println("Escoja una opción: ");
			int eleccion = input.nextInt();
			if (eleccion == 1) {
				
			} else if (eleccion == 2) {
				
			} else if (eleccion == 3) {
				
			} else if (eleccion == 4) {
				
			} else if (eleccion == 5) {
				
			} else if (eleccion == 6) {
				end = true;
			} else {
				System.out.println("Opción no válida, introduzca un valor válido");
			}
		}
		System.out.println("¡Adiós!");
		input.close();
	}

}

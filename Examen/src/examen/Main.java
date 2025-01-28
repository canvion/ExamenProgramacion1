package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
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
			input.nextLine();
			if (eleccion == 1) {
				System.out.println("Elige un nombre para el alumno: ");
				String nombre = input.nextLine();
				Alumno.afegir_alumne(nombre, alumnos);
				for (int i = 0; i < alumnos.size(); i++) {
					System.out.println("Has añadido " + alumnos.get(i).getNombre());
				}
			} else if (eleccion == 2) {
				System.out.println(alumnos.toString());
			} else if (eleccion == 3) {
				System.out.print("Introduce la nota a añadir: ");
				float nota = input.nextFloat();
				
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

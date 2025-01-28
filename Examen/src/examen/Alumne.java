package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	//Atributos
	private int id;
	private String nombre;
	private ArrayList<Float> notas;
	private static int contador;
	
	//Constructores
	public Alumno(String nombre) {
		this.setNombre(nombre);
		Alumno.setContador(this.id);
	}
	
	//Métodos
	@Override
	public String toString() {
        	return "ID: " + id + ", Nom: " + this.nom + ", Notes: " + notes + ", Mitjana: " + calcular_mitjana();
    	}
	

	public float calcular_mitjana() {
        	if (notes.isEmpty()) {
            	return 0;
        	}
        	float suma = 0;
        	for (float nota : notes) {
            	suma += nota;
        	}
        	return suma / notes.size();
    	}

	public static float afegir_notes(Scanner teclado, String mensaje) {
		System.out.print("introduce nota: ");
        float nota = 0; 
        boolean esValida = false; 

        while (!esValida) { 
            System.out.print(mensaje);
            nota = teclado.nextFloat(); 
            if (nota >= 0 && nota <= 10) { 
                esValida = true; 
            } else {
                System.out.println("Error: la nota debe estar entre 0 y 10. Inténtalo de nuevo.");
            }
        }
        return nota; 
        
    }
	public static void delete_notes (ArrayList<notas> notas) {
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introduce la id de la nota que quieres eliminar ");
		String isbn = teclat.nextLine();

		boolean found = false;
		int i = 0;
		while (!found && i<notas.size()) {
			if (lista.get(i).getIsbn().equals(isbn)) {
				lista.remove(i);
				found = true;
			}
			i++;
		}
		if (found) {
			System.out.println("nota eliminado.");
		}else {
			System.out.println("No se ha encontrado el id de la nota que quieres elimnar");
		}
	}
	
	

	//Getters y Setters
    	public int getId() {
       		return id;
    	}

    	public void setNom(String nom) {
		if (nom !=null && !nom.isEmpty()) {
           		this.nom = nom;
        	}
    	}
    
   	public String getNom() {
       		return this.nom;
    	}

 	public ArrayList<Float>getNotes() {
        	return notes;
 	   }

	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Alumno.contador = contador + 1;
	}
}

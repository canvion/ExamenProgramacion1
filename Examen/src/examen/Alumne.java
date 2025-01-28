package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumne {
	//Atributos
	private int id;
	private String nom;
	private ArrayList<Float> notes;
	private static int contador;
	
	//Constructores
	public Alumne(String nom) {
		this.setNom(nom);
		Alumne.setContador(this.id);
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
	public static void delete_notes(ArrayList<Alumne> notes) {
	    Scanner teclat = new Scanner(System.in); // 
	    System.out.println("Introduce la ID del alumno cuya nota quieres eliminar: ");
	    int id;
	    
	    System.out.println("Introduce la id de la nota que quieres eliminar: ");
	    id=teclat.nextInt();

	    boolean found = false;

	    for (int i = 0; i < notes.size(); i++) {
	        if (notes.get(i).getId() == id) { 
	            notes.remove(i);
	            found = true;
	            i--; 	        
	            }
	    }

	    if (found) {
	        System.out.println("Nota eliminada.");
	    } else {
	        System.out.println("No se ha encontrado la id de la nota que quieres eliminar.");
	    }

	    teclat.close();
	 
    } 	
	
	public static void afegir_alumne(String nombre, ArrayList<Alumne> alumnos) {
		Alumne alumno = new Alumne(nombre);
		alumnos.add(alumno);
		System.out.println("El alumno se ha añadido a la lista correctamente");
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
		Alumne.contador = contador + 1;
	}
}


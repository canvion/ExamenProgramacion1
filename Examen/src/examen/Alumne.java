package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	//Atributos
	private int id;
	private String nombre;
	private ArrayList<Float> notas = new ArrayList<Float>();
	private static int contador;
	
	//Constructores
	public Alumno(String nombre) {
		this.setNombre(nombre);
		Alumno.setContador(this.id);
	}
	
	//Métodos
	public void afegir_notes(float nota) {
        boolean esValida = false;

        while (!esValida) {
            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
                esValida = true;
                for (int i = 0; i < notas.size(); i++) {
					System.out.println("Has añadido " + notas.get(i).toString());
				}
            } else {
                System.out.println("Error: la nota debe estar entre 0 y 10. Inténtalo de nuevo.");
            }
        }
        
    }
	
	public void delete_notes(ArrayList<Alumno> notas) {
	    Scanner teclat = new Scanner(System.in); // 
	    System.out.println("Introduce la ID del alumno cuya nota quieres eliminar: ");
	    int id;
	    
	    System.out.println("Introduce la id de la nota que quieres eliminar: ");
	    id=teclat.nextInt();

	    boolean found = false;

	    for (int i = 0; i < notas.size(); i++) {
	        if (notas.get(i).getId() == id) { 
	            notas.remove(i);
	            found = true;
	            i--; 	        
	            }
	    }

	    if (found) {
	        System.out.println("Nota eliminada.");
	    } else {
	        System.out.println("No se ha encontrado la id de la nota que quieres eliminar.");
	    }
	 
    } 	
	
	//Metodo estático
	public static void afegir_alumne(String nombre, ArrayList<Alumno> alumnos) {
		Alumno alumno = new Alumno(nombre);
		alumnos.add(alumno);
		System.out.println("El alumno se ha añadido a la lista correctamente");
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", notas=" + notas + "]";
	}

	//Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nom) {
        if (nom !=null && !nom.isEmpty()) {
            this.nombre = nom;
        }
    }

    public ArrayList<Float>getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Float> notas) {
    	this.notas = notas;
    }
    
    
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Alumno.contador = contador + 1;
	}
}

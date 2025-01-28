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
		this.setNotas(null);
		Alumno.setContador(this.id);
	}
	
	//Métodos
	
	public static float afegi_notes(Scanner teclado, String mensaje) {
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
	    public static float eliminar_notes(Scanner teclado, String mensaje) {
    boolean esValida = false; 
    while (!esValida) { 
    	for(int i=0; i< notes(); i++) {
    		if (i=teclado) {
    			
    		}
    	}
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

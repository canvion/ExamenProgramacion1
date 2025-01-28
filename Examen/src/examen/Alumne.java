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
	public void afegir_nota(ArrayList<Float> notas) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce la nota");
	}
	
	
	

	//Getters y Setters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom !=null && !nom.isEmpty()) {
            this.nom = nom;
        }
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

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
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Float> getNotas() {
		return this.notas;
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

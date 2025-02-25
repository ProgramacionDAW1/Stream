package utilidades;

import java.util.List;

import modelo.Alumno;

import java.util.Comparator;

public class Ordenar {
	public static void main(String[] args) {
		List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
		
		System.out.println(" Alumnos ordenados por nota (descendente):");
		
		alumnos.stream().sorted(Comparator.comparingDouble(Alumno::getNotaMedia).reversed()).forEach(System.out::println);
	}
}

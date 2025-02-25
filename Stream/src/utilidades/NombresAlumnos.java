package utilidades;

import java.util.List;
import java.util.stream.Collectors;

import modelo.Alumno;

public class NombresAlumnos {
	public static void main(String[] args) {
		List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();

		List<String> nombres = alumnos.stream().map(Alumno::getNombre) // Extrae los nombres
				.collect(Collectors.toList());

		System.out.println("Lista de nombres de alumnos:");
		nombres.forEach(System.out::println);
	}
}

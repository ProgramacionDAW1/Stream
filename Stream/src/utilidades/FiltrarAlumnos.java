package utilidades;

import java.util.List;

import modelo.Alumno;

public class FiltrarAlumnos {
	public static void main(String[] args) {
		List<Alumno> alumnos = ListaAlumnos.obtenerListaAlumnos();
		System.out.println(" Alumnos con nota superior a 7:");
		alumnos.stream().filter(alumno -> alumno.getNotaMedia() > 7).forEach(System.out::println);
	}
}
package utilidades;

import java.util.Arrays;
import java.util.List;

import modelo.Alumno;

public class ListaAlumnos {
	
public static List<Alumno> obtenerListaAlumnos() {
	
	return Arrays.asList(
		new Alumno("Ana", "1o DAM", 8.5),
		new Alumno("Pedro", "2o DAM", 5.3),
		new Alumno("Lucía", "1o DAW", 7.8),
		new Alumno("Carlos", "2o DAW", 6.9),
		new Alumno("Sofía", "1o DAM", 9.1),
		new Alumno("Juan", "2o DAW", 4.5)
);
}
}
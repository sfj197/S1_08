package n3ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class MetodosAlumnos {

	public static void mostrar(List<Alumno> lista) {

		lista.forEach(a -> System.out.println(a.getNombre() + " " + a.getEdad()));

	}

	public static void nombresConA(List<Alumno> lista) {

		List<Alumno> conA = lista.stream().filter(a -> a.getNombre().startsWith("A")).collect(Collectors.toList());

		System.out.println(conA);

	}
	
		public static void aprobados(List<Alumno>lista) {
		
		lista.stream().filter(a -> a.getNota() >=5).
		
		forEach(System.out::println);
			
		
	}
	
	public static void noSonPHP(List<Alumno>lista) {
		
	lista.stream().filter(a -> a.getNota() >=5 && a.getCurso() != "PHP").
		
		forEach(System.out::println);
		
		
	}
	
	public static void sonDeJava(List<Alumno>lista) {
		
		lista.stream().filter(a -> a.getEdad() >=18 && a.getCurso().equalsIgnoreCase("Java")).
		forEach(System.out::println);
	}

}

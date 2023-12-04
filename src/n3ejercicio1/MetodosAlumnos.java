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
		
		lista.forEach(a -> {
			if(a.getNota() >= 5) {
				
				System.out.println(a);
			}
		});
		
		
	}
	
	public static void noSonPHP(List<Alumno>lista) {
		
		lista.forEach(a -> {
			if(a.getNota() >= 5 && a.getCurso() != "PHP") {
				
				System.out.println(a);
			}
		});
		
		
	}
	
	public static void sonDeJava(List<Alumno>lista) {
		
		lista.forEach(a -> {
			if(a.getCurso().equalsIgnoreCase("java") && a.getEdad() >=18) {
				
				System.out.println(a);
			}
		});
	}

}

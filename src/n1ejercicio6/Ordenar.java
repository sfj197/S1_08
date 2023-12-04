package n1ejercicio6;

import java.util.List;

public class Ordenar {
	
	public static void ordenar(List<Object>o) {
		
		o.stream().filter(cadena -> cadena instanceof String).
		sorted((c1,c2) -> ((String)c1).length() - ((String)c2).length()).forEach(System.out::println);
		
	}

}

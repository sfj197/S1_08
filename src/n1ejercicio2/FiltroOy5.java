package n1ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroOy5 {
	
	public static void contieneOy5(List<String> cadenas) {
		
		List<String>o = cadenas.stream().
				filter(cadena -> (cadena.contains("o") || cadena.contains("O"))
						&& cadena.length() > 5).collect(Collectors.toList());
		
		System.out.println(o);
		
	}

}

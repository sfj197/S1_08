package n2ejercicio2;

import java.util.List;
import java.util.stream.Collectors;

public class Cadena {
	
	public static String devolver(List<Integer>enteros) {
		
		String cadena = enteros.stream().map(n -> {
			
			if(n % 2 == 0) {
				
				return "e" + n;
			}else {
				
				return "o" + n;
			}
		}).collect(Collectors.joining(","));
		
		return cadena;
	}

}

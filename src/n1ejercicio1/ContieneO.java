package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContieneO {
	
	public static void contienenO(ArrayList<String>lista) {
		
		List<String>o = lista.stream().
				filter(cadena -> cadena.contains("o") || cadena.contains("O")).
				collect(Collectors.toList());
		
		System.out.println(o);
		
	}

}

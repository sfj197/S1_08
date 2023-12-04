package n2ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Comienzan {
	
	public static List<String> conA(List<String>lista) {
		
		List<String>conA = lista.stream().filter((a) -> a.startsWith("A")
				&& a.length() == 3).collect(Collectors.toList());
		
		
		return conA;
		
	}

		
}

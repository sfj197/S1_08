package n1ejercicio7;

import java.util.List;

public class OrdenarAlreves {
	
	public static void ordenarAlreves(List<Object>o) {
		
		o.stream().filter(cadena -> cadena instanceof String).
		sorted((c1,c2) -> ((String)c2).length() - ((String)c1).length()).
		forEach(System.out :: println);
	}

}

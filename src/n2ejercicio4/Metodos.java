package n2ejercicio4;

import java.util.Comparator;
import java.util.List;

public class Metodos {
	
	public static void primerCaracter(List<String>lista) {
		
		lista.sort(Comparator.comparingInt((n) -> n.charAt(0)));
		
		System.out.println(lista);
		
		
	}
	
	public static void primeroE(List<String>lista) {
		
		lista.sort(Comparator.comparingInt(n -> {if (n.contains("e") || n.contains("E")) {
			
			return 0;
			
		}else {
			
			return n.charAt(0);
		}
			
		}));
		
		System.out.println(lista);
	}
	
	public static void modificaA(List<String>lista) {
		
		lista.replaceAll(a -> {
			
			if(a.contains("a")) {
				
				return a.replace("a", "4");
				
			}else if(a.contains("A")) {
				
				return a.replace("A", "4");
				
			}else {
				
				return a;
			}
		});
		System.out.println(lista);
		
	}
	
	public static void mostrarNumeros(List<String>lista) {
		
		lista.forEach(n -> {if(n.charAt(0) > 47 && n.charAt(0) < 58) {
			
			System.out.println(n + ",");
			
		}
			
		
		});
		
	}

}

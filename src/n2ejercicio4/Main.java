package n2ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> elementos = new ArrayList<String>();

		elementos.add("Eloi");
		elementos.add("1234");
		elementos.add("Avion");
		elementos.add("Casa");
		elementos.add("4589");
		elementos.add("Erudito");
		elementos.add("Antena");
		
		Metodos.primerCaracter(elementos);
		Metodos.primeroE(elementos);
		Metodos.mostrarNumeros(elementos);
		Metodos.modificaA(elementos);
		
		
		


	}
}

package n2ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(5);
		numeros.add(4);
		numeros.add(3);
		numeros.add(8);
		
		System.out.println(Cadena.devolver(numeros));
		
	
	}
	

}

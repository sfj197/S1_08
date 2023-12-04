package n2ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nombres = new ArrayList<String>();

		nombres.add("Jorge");
		nombres.add("Ana");
		nombres.add("Andres");
		nombres.add("Asi");
		nombres.add("Tomas");
		nombres.add("Pedro");
		
		System.out.println(Comienzan.conA(nombres));

	}



}

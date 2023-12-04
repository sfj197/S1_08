package n1ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cadenas = new ArrayList<String>();

		cadenas.add("Oregano");
		cadenas.add("Oreja");
		cadenas.add("organo");
		cadenas.add("casa");
		cadenas.add("pizarra");

		ContieneO.contienenO(cadenas);

	}


}

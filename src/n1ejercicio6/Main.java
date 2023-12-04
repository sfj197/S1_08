package n1ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> elementos = new ArrayList<Object>();

		elementos.add("woooo");
		elementos.add(112233);
		elementos.add("perro");
		elementos.add(44552);
		elementos.add("ordenador");
		elementos.add("colores");
		elementos.add(209864556);

		Ordenar.ordenar(elementos);

	}

}

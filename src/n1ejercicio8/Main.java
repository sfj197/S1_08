package n1ejercicio8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IReverse voltear = (n) -> new StringBuilder(n).reverse().toString();
		
		String cadenaAlReves = voltear.reverse("Que tal estas");
		
		System.out.println(cadenaAlReves);

	}

}

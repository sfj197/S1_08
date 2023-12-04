package n2ejercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICalculadora suma = (a,b) -> a + b;
		ICalculadora resta = (a,b) -> a - b;
		ICalculadora multiplicacion = (a,b) -> a * b;
		ICalculadora division = (a,b) -> a / b;
		
		float resSuma = suma.operacion(3,4);
		float resResta = resta.operacion(2, 4);
		float resMulti = multiplicacion.operacion(10,20);
		float resDivision = division.operacion(1, 67);
		
		System.out.println(resDivision);

	}

}

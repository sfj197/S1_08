package n3ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Alumno>listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno("Jorge", 46, "Java", 6));
		listaAlumnos.add(new Alumno("Pedro", 33, "PHP", 4));
		listaAlumnos.add(new Alumno("Antonio", 22, "C", 5));
		listaAlumnos.add(new Alumno("Ivan", 46, "Java", 3));
		listaAlumnos.add(new Alumno("Andres", 50, "Angular", 8));
		listaAlumnos.add(new Alumno("Silvia", 44, "Java", 7));
		listaAlumnos.add(new Alumno("Alan", 30, "PHP", 9));
		listaAlumnos.add(new Alumno("Adrian", 43, "Java", 6));
		listaAlumnos.add(new Alumno("Abril", 24, "C", 3));
		listaAlumnos.add(new Alumno("Oscar", 15, "Java", 2));
		
		MetodosAlumnos.mostrar(listaAlumnos);
		MetodosAlumnos.nombresConA(listaAlumnos);
		MetodosAlumnos.aprobados(listaAlumnos);
		System.out.println();
		MetodosAlumnos.noSonPHP(listaAlumnos);
		System.out.println();
		MetodosAlumnos.sonDeJava(listaAlumnos);
		


	}

}

import java.util.Scanner;
public class Aplicativo1{
	public static void msin(String []args){
		String nombre;
	    String apellido;
		String cedula;
		String sexo;
		float  sueldo;
		String direccion;
		Scanner lee=new Scanner (System.in);
		System.out.println("ingrese el nombre");
		nombre=lee.next();
		System.out.println("ingrese el apellido");
		apellido=lee.next();
		System.out.println("ingrese la cedula");
		cedula=lee.next();
		System.out.println("ingrese el sexo");
		sexo=lee.next();
		System.out.println("ingrese su sueldo");
		sueldo=lee.nextFloat();
		System.out.println("ingrese la direccion");
		direccion=lee.next();
		Persona obj = new Persona( nombre, apellido, cedula, sexo, sueldo, direccion);
		obj . imprimirDatos();
	}
}
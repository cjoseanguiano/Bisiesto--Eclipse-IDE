import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorA;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el año");
		valorA = entrada.nextInt();

		if (esBisiesto(valorA)) {
			System.out.println("SI es Bisiesto");
		} else {
			System.out.println("NO es Bisiesto");
		}
	}

	public static boolean esBisiesto(int a) {

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}

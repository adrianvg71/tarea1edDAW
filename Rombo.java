import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de pisos");
		int pisos = sc.nextInt();
		

		for (int altura = 1; altura<=pisos; altura++) {
			for(int blancos = 1; blancos<=pisos-altura; blancos++) {
				System.out.print(" ");
			}
		
		
			for(int asteriscos = 1; asteriscos<=(altura*2)-1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		pisos--;

		for (int altura = 1; altura <= pisos; altura++) {
			for (int blancos = 1; blancos <= altura; blancos++) {
				System.out.print(" ");
			}

			for (int asteriscos = 1; asteriscos <= (pisos - altura) * 2 + 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}


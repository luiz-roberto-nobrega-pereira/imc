package imc;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Informe a sua altura: ");
		double altura = sc.nextDouble();
		double imc = peso/(altura*altura);
		System.out.printf("O seu IMC: %.2f ",imc);
		
		
		sc.close();

	}

}

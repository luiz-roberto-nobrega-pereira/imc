package imc;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("IMC ELETRONICO:");
		System.out.println();
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Cadastre uma senha com quatro números: ");
		int senha = sc.nextInt();
		System.out.println("Informe a sua senha cadastrada: ");
		int senhaCadastrada = sc.nextInt();
		while(senha != senhaCadastrada) {
			System.out.println("Informe a sua senha cadastrada: ");
			senhaCadastrada = sc.nextInt();
		}
		
		System.out.println("Informe o seu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Informe a sua altura: ");
		double altura = sc.nextDouble();
		double imc = peso/(altura*altura);
				
		if(imc >= 40) {
			System.out.printf("IMC: %.2f - Obesidade mórbida",imc);
		}
		else if(imc >= 35) {
			System.out.printf("IMC: %.2f - Obesidade ",imc);
		}
		else if(imc >= 30) {
			System.out.printf("IMC: %.2f - Sobrepeso",imc);
		}
		else if(imc >= 25) {
			System.out.printf("IMC: %.2f - Peso normal",imc);
		}
		else {
			System.out.printf("IMC: %.2f - Abaixo do peso",imc);
		}
		
		
		sc.close();

	}
}
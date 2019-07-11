package com.imc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	
	public static void main(String[] args) {
		
		System.out.println("==== Calculadora de IMC ====");
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o seu peso:(ex.: 60,5) ");
		double peso = scan.nextDouble();
		System.out.println("Insira o sua altura(ex.: 1,60): ");
		double altura = scan.nextDouble();
		System.out.println("Confirmando os dados inseridos: ");
		System.out.println("Seu peso é: " + peso + "kg");
		System.out.println("Sua altura é: " + altura + "m");
		double imc = peso/(altura*altura);
		System.out.println("****** RESULTADO ******");
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("Seu imc é " + df.format(imc));
		if (imc < 17){
			System.out.println("Você está muito abaixo do peso!");
		}else if(imc >= 17 && imc <= 18.49) {
			System.out.println("Você está abaixo do peso!");
	    }else if (imc >= 18.5 && imc <= 24.99) {
	    	System.out.println("Você está com peso normal!");
	    }else if (imc >= 25 && imc <= 29.99) {
	    	System.out.println("Você está acima do peso!");
	    }else if (imc >= 30 && imc <=34.99) {
	    	System.out.println("Você está com Obesidade I !");
	    }else if (imc >= 35 && imc <= 39.99) {
	    	System.out.println("Você está com Obesidade II (severa)!");
	    }else if (imc >= 40) {
	    	System.out.println("Você está com Obesidade III (mórbida!)");
	    }

}
}

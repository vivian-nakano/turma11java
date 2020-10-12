package listaPortugol;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		/*
		Declarando variáveis
		inteiro totalSegundos, 
		inteiro tempoHoras=0 
		inteiro tempoMinutos=0 
		inteiro tempoSegundos=0 
		inteiro restoHoras=0 
		inteiro restoMinutos=0


		//entrada de dados
		escreva("Informe o tempo total em segundos: ")
		leia(totalSegundos)

		//Processamento
		restoHoras = totalSegundos % 3600
		tempoHoras = (totalSegundos- restoHoras)/3600
		restoMinutos = restoHoras % 60
		tempoMinutos = (restoHoras-restoMinutos)/60
		tempoSegundos = restoMinutos
		

		//saída de dados

		escreva("O tempo em total é de: " + tempoHoras + " horas " + tempoMinutos+ " minutos " + tempoSegundos + " segundos ")

		 */
		
		Scanner leia = new Scanner(System.in);
		int tempoDeDuracao = 0, horas = 0, minutos = 0,segundos = 0;
		
		System.out.println("Digite a duração do evento em segundos: ");
		tempoDeDuracao = leia.nextInt();
		horas = (tempoDeDuracao/3600);
		minutos = (tempoDeDuracao%3600)/60;
		segundos = (tempoDeDuracao%3600)%60;
		
		System.out.println("Seu evento durou " + horas + " horas, " + minutos+" minutos, " + segundos+" segundos.");
		
		
		
	}

}

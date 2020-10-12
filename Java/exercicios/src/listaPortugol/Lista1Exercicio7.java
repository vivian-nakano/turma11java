package listaPortugol;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		/*
		 * 		inteiro
		a , b , c , d , E , f  , x , y
		
		escreva (" informe o Valor de A : ")
		leia (a)
		pula()
		escreva (" informe o Valor de B : ")
		leia (b)
		pula()
		escreva (" informe o Valor de C : ")
		leia (c)
		pula()
		escreva (" informe o Valor de D : ")
		leia (d)
		pula()
		escreva (" informe o Valor de E : ")
		leia (E)
		pula()
		escreva (" informe o Valor de F : ")
		leia (f)
		pula()
		 x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) )
		 y =  ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) )
		 escreva (" O valor de X é : " , x )
		 pula()
		 escreva (" O valor de Y é : " , y)
	}
}
		 */
		
		int a , b , c , d , E , f ;
		double x = 0 , y = 0;
		
		//criar um teclado dentro do programa
				Scanner leia = new Scanner(System.in); //criou o teclado
				
				System.out.print("Informe o valor de A: ");
				a = leia.nextInt();
				System.out.print("Informe o valor de B: ");
				b = leia.nextInt();
				System.out.print("Informe o valor de C: ");
				c = leia.nextInt();
				System.out.print("Informe o valor de D: ");
				d = leia.nextInt();
				System.out.print("Informe o valor de E: ");
				E = leia.nextInt();
				System.out.print("Informe o valor de F: ");
				f = leia.nextInt();
				
				x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) );
				y =  ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) );
				
				System.out.printf("O valor de X é:  %.2f \n",x);
				System.out.printf("O valor de Y é: %.2f",y);
				
				
				leia.close();
				
				
	}

}

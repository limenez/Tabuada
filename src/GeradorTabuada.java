
import java.util.Scanner;

public class GeradorTabuada {

	public static void main(String[] args) {
		// Criar as variáveis
		int num_tabuada,valor_tabuada;
		
		//Implementar um valor de tabuada
		//num_tabuada=5;
		
		//Chamar o objeto Scanner
		Scanner teclado = new Scanner(System.in);
		//Mensagem na tela
		System.out.println("Digite a tabuada desejada: ");
		
		// Implementar a varável com o valor digitado
		num_tabuada=teclado.nextInt();
		
		// Criar o laco de repeticao
		for(int contador=1; contador<=10; contador++) {
			valor_tabuada=num_tabuada*contador;
			System.out.println(num_tabuada+" x "+contador+" = "+valor_tabuada);
			
		}

	}

}



import java.util.Scanner;

public class TabuadaCompleta {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	    	  int A;
	    	    do {
	    	        Scanner tab = new Scanner(System.in);
	    	        System.out.println("Informar um número (0(zero) para finalizar):");

	    	        A = tab.nextInt();
	    	        if (A != 0) {
	    	            int mult = 0;
	    	            while (mult < 10) {
	    	                mult++;
	    	                System.out.println(A + " * " + mult + "  = " + (A * mult));
	    	            }
	    	        }
	    	    } while (A != 0);

	    	}
}
import java.util.Scanner;

public class Uri1017{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int X,Y;
        double litros;

        X = teclado.nextInt();
        Y = teclado.nextInt();
        
        litros = (X*Y)/12.0000565;
        
        System.out.printf("%.3f\n", litros);
    }
}
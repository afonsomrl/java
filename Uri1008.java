import java.util.Scanner;

public class Uri1008{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int NUMBER,X;
        double Y, SALARY;

        NUMBER = teclado.nextInt();
        X = teclado.nextInt();
        Y = teclado.nextDouble();

       SALARY = (X * Y);
        
        System.out.println("NUMBER = "+ NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
    }
}
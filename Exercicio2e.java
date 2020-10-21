import java.util.Scanner;

public class Exercicio2e{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, baseMenor, baseMaior, altura;

        System.out.println("Por favor, digite um valor do base maior do trapezio");
        baseMaior = teclado.nextFloat();
        System.out.println("Por favor, digite um valor do base menor do trapezio");
        baseMenor = teclado.nextFloat();
        System.out.println("Por favor, digite um valor da altura do trapezio");
        altura = teclado.nextFloat();

        area = (baseMaior+baseMenor)*altura/2;

        System.out.printf("Valor da area e %.4f ", area);
    }

}
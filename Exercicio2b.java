import java.util.Scanner;

public class Exercicio2b{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, base, altura;

        System.out.println("Por favor, digite um valor do base do retangulo");
        base = teclado.nextFloat();
        System.out.println("Por favor, digite um valor da altura do retangulo");
        altura = teclado.nextFloat();

        area = base*altura;

        System.out.println("Valor da area = "+area);
    }

}
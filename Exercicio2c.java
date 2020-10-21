import java.util.Scanner;

public class Exercicio2c{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, base, altura;

        System.out.println("Por favor, digite um valor do base do triangulo");
        base = teclado.nextFloat();
        System.out.println("Por favor, digite um valor da altura do triangulo");
        altura = teclado.nextFloat();

        area = (base*altura)/2;

        System.out.println("Valor da area = "+area);
    }

}
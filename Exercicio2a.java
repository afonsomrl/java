import java.util.Scanner;

public class Exercicio2a{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, lado;

        System.out.println("Por favor, digite um valor do lado");
        lado = teclado.nextFloat();

        area = lado*lado;

        System.out.println("Valor da area = "+area);
    }

}
import java.util.Scanner;

public class TestandoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor=0;

        while (valor<=10){
            System.out.println("valor = "+valor);
            valor = valor+1;
        }
        
        System.out.println("Fim do Programa");
    }
}
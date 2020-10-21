import java.util.Scanner;

public class TestandoDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor=0;

        do {
            System.out.println("valor = "+valor);
            valor = valor+1;
        }while (valor<=10);
        
        System.out.println("Fim do Programa");
    }
}
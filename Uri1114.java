import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;

        do{
            numero = teclado.nextInt();
            if(numero!=2002){
                System.out.println("Senha Invalida");
            }
        }while(numero!=2002);

        System.out.println("Acesso Permitido");
         
    }
}
import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero,i=1;
           
        numero = teclado.nextInt();

        if(numero%2==0){
            numero++;
            do{
                System.out.println(numero);
                numero+=2;
                i++;
            }while(i<=6);
        }
        else{
            do{
                System.out.println(numero);
                numero+=2;
                i++;
            }while(i<=6);
        }
        
    }
}
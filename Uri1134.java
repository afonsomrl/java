import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x,alcool=0;
        int gasolina=0;
        int diesel=0;
        
        do{
            x = teclado.nextInt();       
            if (x==1){
                alcool++;
            }
            else if (x==2){
                gasolina++;
            }
            else if (x==3){
                diesel++;
            }
           
        }while(x!=4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}
import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, un;
        float total;
       
        cod = teclado.nextInt();
        un = teclado.nextInt();
        
        if (cod==1){
            total = un *4.0f;
        }
        else{
            if (cod==2){
                total = un*4.5f;
            }
            else{
                if(cod==3){
                    total =un*5.0f;
                }
                else{
                    if(cod==4){
                        total=un*2.0f;
                    }
                    else{
                        total=un*1.5f;
                    }
                }
            }
        }
        System.out.printf("Total: R$ %.2f\n",total);
    }
}
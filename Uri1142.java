import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x;
        int a=1;
        int b=2;
        int c=3;
        
        x = teclado.nextInt();

        for(int cont=1;cont<=x;cont++){
            System.out.println(a+" "+b+" "+c+" PUM");
            a+=4;
            b+=4;
            c+=4;
        }
        
    }
}
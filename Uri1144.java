import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x;
        int a=1;
        int b=1;
        int c=1;
        
        x = teclado.nextInt();

        for(int cont=1;cont<=x;cont++){
            System.out.println(a+" "+b+" "+c);
            System.out.println(a+" "+(b+1)+" "+(c+1));
            a++;
            b=a*a;
            c=b*a;
        }
        
    }
}
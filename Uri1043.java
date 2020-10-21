import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a,b,c,area,perimetro ;
       
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
                   
        if ((b+c>a)&&(a+c>b)&&(a+b>c)){
            perimetro=a+b+c;
            System.out.println("Perimetro = "+perimetro);
        }
        else{
            area= (a+b)*c/2;
            System.out.println("Area = "+area);
        }
                
    }
}
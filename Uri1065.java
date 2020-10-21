import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero;
        int qtdPares =0;
           
        
        for (int cont=1;cont<=5;cont++){
            numero = teclado.nextFloat();
            if(numero%2==0){
                //soma=soma+numero;
                qtdPares++;
            }
            
        }
        //media=soma/qtdPositivos;
        System.out.println(qtdPares+" valores pares");
        //System.out.printf("%.1f\n",media);
    }
}
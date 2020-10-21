import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero,media,soma=0;
        int qtdPositivos =0;
           
        
        for (int cont=1;cont<=6;cont++){
            numero = teclado.nextFloat();
            if(numero>0){
                soma=soma+numero;
                qtdPositivos++;
            }
            
        }
        media=soma/qtdPositivos;
        System.out.println(qtdPositivos+" valores positivos");
        System.out.printf("%.1f\n",media);
    }
}
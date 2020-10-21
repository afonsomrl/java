import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero;
        int qtdPares =0;
        int qtdImpares =0;
        int qtdPositivos =0;
        int qtdNegativos =0;
           
        
        for (int cont=1;cont<=5;cont++){
            numero = teclado.nextFloat();
            if(numero%2==0){
                qtdPares++;
            }
            else{
                qtdImpares++;
            }
            if(numero>0){
                qtdPositivos++;
            }
            else if(numero<0){
                qtdNegativos++;
            }
        }
        System.out.println(qtdPares+" valor(es) par(es)");
        System.out.println(qtdImpares+" valor(es) impar(es)");
        System.out.println(qtdPositivos+" valor(es) positivo(s)");
        System.out.println(qtdNegativos+" valor(es) negativo(s)");
    }
}
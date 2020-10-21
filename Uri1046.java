import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int inicio,fim,duracao;
               
        inicio = teclado.nextInt();
        fim = teclado.nextInt();
        
        if (fim>inicio){
            duracao=fim-inicio;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
        else if (fim<inicio){
            duracao=fim-inicio+24;
            System.out.printf("O JOGO DUROU %d HORA(S)\n" ,duracao);
        }
        else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }             
    }
}
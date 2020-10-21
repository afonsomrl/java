import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int inicio,fim,horaInicio,horaFim,minutoFim,minutoInicio,duracao,duracaoHora,duracaoMinuto;
               
        horaInicio = teclado.nextInt();
        minutoInicio = teclado.nextInt();
        horaFim = teclado.nextInt();
        minutoFim = teclado.nextInt();
        
        inicio=horaInicio*60+minutoInicio;
        fim=horaFim*60+minutoFim;

        if (fim>inicio){
            duracao=fim-inicio;
            duracaoHora=duracao/60;
            duracaoMinuto=duracao%60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHora, duracaoMinuto);
        }
        else if (fim<inicio){
            duracao=fim-inicio+1440;
            duracaoHora=duracao/60;
            duracaoMinuto=duracao%60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHora, duracaoMinuto);
        }
        else{
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }             
    }
}
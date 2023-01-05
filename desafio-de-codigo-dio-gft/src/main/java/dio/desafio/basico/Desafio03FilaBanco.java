package dio.desafio.basico;

import java.util.Scanner;

public class Desafio03FilaBanco {
    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);
        var posicao = 1;
        for (var  i = 0 ; i < nomesFila.length ; i++){
            nomesFila[i] = nome.next();
            System.out.println( nomesFila[i] + " - esta na posicao: " + posicao++);
        }

    }
}

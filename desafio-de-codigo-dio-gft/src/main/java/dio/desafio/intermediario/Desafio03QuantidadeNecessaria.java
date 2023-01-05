package dio.desafio.intermediario;

import java.util.Scanner;

public class Desafio03QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int N = 0;
        int X = 0;
        double TOT = 0;
        for(var i = 0; i < T; i++){
            N = scanner.nextInt();
            X = scanner.nextInt();
            TOT = N * X;
        }

        double totP = TOT / SLICE;

        if(totP % 1 != 0 ){
            totP = Math.ceil(totP);
        }


        int IntValue = (int) totP;

        System.out.println(IntValue);





    }
}

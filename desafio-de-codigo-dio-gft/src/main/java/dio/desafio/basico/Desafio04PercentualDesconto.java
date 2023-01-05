package dio.desafio.basico;

import java.util.Scanner;

public class Desafio04PercentualDesconto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        double desconto =  ((float)(M - S)  / M) * 100;

        System.out.println("O desconto foi de "+ ((int) desconto) +"%");


    }
}

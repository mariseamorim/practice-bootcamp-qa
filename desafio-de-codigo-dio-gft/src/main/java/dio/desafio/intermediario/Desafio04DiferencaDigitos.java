package dio.desafio.intermediario;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio04DiferencaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");




        int p =1;
        int s = 0;

        for(var i = 0; i < split.length; i++){
            p =  Integer.parseInt(split[i]) * p;
            s = s + Integer.parseInt(split[i]);
        }

        int resultado = p - s;
        System.out.println(resultado);


    }
}

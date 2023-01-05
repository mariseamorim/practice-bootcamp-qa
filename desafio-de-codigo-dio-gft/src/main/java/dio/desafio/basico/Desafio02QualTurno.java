package dio.desafio.basico;

import java.util.Scanner;

public class Desafio02QualTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        switch (turno){
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;

            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }

    }
}


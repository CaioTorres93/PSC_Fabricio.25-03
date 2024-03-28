import java.util.Random;
import java.util.Scanner;

public class fabricio_lista4_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100)+1;
        int tentativas =0;

        System.out.println("Bem vindo ao jogo da advinhação.");
        System.out.println("Tente advinhas um numero entre 1 e 100.");

        while (true) {
            System.out.println("Digite o palpite: ");
            int palpite = input.nextInt();
            tentativas++;

            if (palpite == numero) {
                System.out.println("Isso ai, voce acertou!");
                break;
                
            }
         else if (palpite < numero) {
            System.out.println("Seu palpite é muito baixo. Tente novamente.");
        } else {
            System.out.println("Seu palpite é muito alto. Tente novamente.");
            
        }
       
            
        }
        System.out.println("Voce acertou em "+ tentativas);

    }
}
import java.util.Scanner;
public class fabricio_lista4_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.println("Digite um numero:");
            numero = input.nextInt();

            if (numero ==0 ) {
                System.out.println("Programa finalizado.");
                break;
                
            }
            else if (true) {
                System.out.println("quadrado dos numeros apresentados e:" + Math.pow(numero, 2));
                System.out.println("cubo do numero apresentado é: " + Math.pow(numero, 3));
                System.out.println("Raiz quadrada do numero apresentado é: " + Math.sqrt(numero));

                
            }
            
        }

        input.close();
    }
}
import java.util.Scanner;
public class fabricio_lista4_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número real A: ");
        double A = input.nextDouble();

        System.out.print("Digite o número inteiro B: ");
        int B = input.nextInt();

        double produto = calcularProduto(A, B);
        System.out.println("O produto de " + A + " por " + B + " é: " + produto);
    }

    // Função para calcular o produto usando adições sucessivas
    private static double calcularProduto(double A, int B) {
        double produto = 0;

        for (int i = 0; i < Math.abs(B); i++) {
            produto += A;
        }

        // Considerar o sinal de B
        if (B < 0) {
            produto = -produto;
        }

        return produto;
    }
}
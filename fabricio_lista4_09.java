import java.util.Scanner;
public class fabricio_lista4_09 {
    public static void main(String[] args) {
        int populacaoA = 5_000_000; // População do país A (5 milhões)
        int populacaoB = 7_000_000; // População do país B (7 milhões)
        double taxaNatalidadeA = 0.03; // Taxa de natalidade do país A (3% ao ano)
        double taxaNatalidadeB = 0.02; // Taxa de natalidade do país B (2% ao ano)
        int anos = 0; // Contador de anos

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaNatalidadeA);
            populacaoB += (int) (populacaoB * taxaNatalidadeB);
            anos++;
        }

        System.out.println("Em " + anos + " anos, a população de A ultrapassará a população de B.");
        System.out.println("População de A: " + populacaoA);
        System.out.println("População de B: " + populacaoB);
    }
}
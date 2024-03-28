import java.util.Scanner;
public class fabricio_lista4_11 {

    public static void main(String[] args) {
        double massaInicial = 1.0; // Massa inicial do material (1 grama)
        double massaDesejada = 0.10; // Massa desejada (0,10 grama)
        double taxaDecaimento = 0.25; // Taxa de decaimento (25% a cada 30 segundos)
        int segundosPorCiclo = 30; // Tempo em segundos para cada ciclo

        double massaAtual = massaInicial;
        int tempoEmSegundos = 0;

        while (massaAtual > massaDesejada) {
            massaAtual *= (1 - taxaDecaimento); // Atualiza a massa após o decaimento
            tempoEmSegundos += segundosPorCiclo;
        }

        System.out.println("Tempo necessário para a massa ser menor que 0,10 grama: " + tempoEmSegundos + " segundos.");
    }
}

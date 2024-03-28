import java.util.Scanner;
public class fabricio_lista4_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade = 0 ;
        double altura = 0;
        double peso = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){

            System.out.println("Digite a idade: ");
            int idadeS = input.nextInt();
            System.out.println("Digite a altura: ");
             int alturaS =input.nextInt();
            System.out.println("Digite o peso: ");
            int pesoS = input.nextInt();

           if(idadeS > 50){

             idade++;
            
           } 
           else if (idadeS>10 && idadeS<20) {

            altura += alturaS;
             count ++;

            
           }
           if (pesoS<40) {

            peso++;
            
           }

        }
        System.out.println("Quantidade de pessoas acima dos 50 anos: " + idade);
        System.out.println("Media de altura de pessoas entre 10 e 20 anos: "+ altura/count );
        System.out.println("Porcentagem de pessoas abaixo de 40kg:" + peso*10);
        
        input.close();
    }
}
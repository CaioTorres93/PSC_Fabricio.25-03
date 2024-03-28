import java.util.Scanner;
public class fabricio_lista4_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros;
        int produto = 1 ;
        int soma = 0;

        while (true) {
            System.out.println("Digite um numero: ");
            numeros = input.nextInt();
            if (numeros ==0) {
                break;

                
            }
            else if (numeros %2==0) {
                soma += numeros;
        
            }
            else if (numeros %2!=0) {
                produto *=numeros;
                
            }
        }
        System.out.println("Soma dos numero pares: "+ soma);
        System.out.println("Produto dos numeros impares: "+ produto);

    


        
            

            
         
            
        


    }
    
}

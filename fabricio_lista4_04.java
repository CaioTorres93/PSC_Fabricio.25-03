import java.util.Scanner;
public class fabricio_lista4_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int kills ;
        int deaths ;
        int assists ;
        char winner;

        do{
            System.out.println("Houve quantos kills ?");
            kills = input.nextInt();
            System.out.println("Houve quantos deaths?");
            deaths = input.nextInt();
            System.out.println("Houve quantos assistis?");
            assists = input.nextInt();

            if (kills <=5) {
                System.out.println("Noob!");
                
            }
            else if (kills >=20) {
                System.out.println("Master!");
                
            }
            if (deaths >= 20) {
                System.out.println("Houston we have a problem");
            }
            if (assists >= 20) {
                System.out.println("Team work!");
            }
            System.out.println("Temos um vencedor?:");
            winner = input.next().charAt(0);

        }while (winner != 's');

        System.out.println("TEMOS UM VENCEDOR!!!!!");
        
    
        
    }
        
            
        
        
    }
        

        

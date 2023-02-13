package strife;

import java.util.Scanner;
import java.util.function.Function;

public class Game{

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.print("Enter Player 1 name");
        String name1 = k.next();
        
        System.out.print("Enter Player 2 name");
        String name2 = k.next();
        
        CardGenerator one = new CardGenerator();
        Functions two = new Functions();
        Player three = new Player();
        Points four = new Points();
    }
    
}

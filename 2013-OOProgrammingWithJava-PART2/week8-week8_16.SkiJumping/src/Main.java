
import java.util.Scanner;


public class Main {
    private Scanner reader = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Tournament tourney = new Tournament();
        TextInterface ui = new TextInterface(reader, tourney);
        ui.start();
    }
    
    
}

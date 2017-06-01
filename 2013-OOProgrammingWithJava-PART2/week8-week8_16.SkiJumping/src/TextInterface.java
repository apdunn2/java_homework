
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */


public class TextInterface {
    private Scanner reader;
    private Tournament tourney;
    
    public TextInterface(Scanner reader, Tournament tourney){
        this.tourney = tourney;
        this.reader = reader;
       
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        createJumpers();
        System.out.println("\nThe tournament begins!\n");
        jump();
        tournamentResults();
    }
    
    public void createJumpers(){
        while(true){
            System.out.print("  Participant name:");
            String jumperName = reader.nextLine();
            System.out.println("");
            if(jumperName.isEmpty()){
                break;
            }
            tourney.addJumper(new Jumper(jumperName));
            
            
        }
    }
    
    public void jump(){
        int i = 1;
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String userInput = reader.nextLine();
            System.out.println("\n");
            if(!userInput.equals("jump")){
                break;
            }
            tourney.sortJumpers();
            System.out.println("Round " + i +"\n");
            System.out.println("Jumping order:");
            tourney.printJumpingOrder();
            System.out.println("Results of round " + i);
            tourney.printRoundStatistics();
            i++;
        }
        
        System.out.println("Thanks!\n");
    }
    
    public void tournamentResults(){
        tourney.printFinalResults();
    }
    

    
}

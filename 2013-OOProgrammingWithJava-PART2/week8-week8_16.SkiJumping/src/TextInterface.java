
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
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        createJumpers();
    }
    
    public void createJumpers(){
        while(true){
            System.out.print("Participant name: ");
            String jumperName = reader.nextLine();
            if(jumperName.isEmpty()){
                break;
            }
            tourney.addJumper(new Jumper(jumperName));
            
            
        }
    }
    

    
}

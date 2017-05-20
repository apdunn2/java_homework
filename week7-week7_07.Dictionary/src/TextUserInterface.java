
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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dict  = dictionary;
    }
    
    public void start(){
        askForStatement();
        System.out.println("/n  quit - quit the text user interface");
        while(true){
            askForStatement();
            String statement = reader.nextLine();
            if(statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(statement.equals("add")){
                add();
                System.out.print("\n\n");
            }else if(statement.equals("translate")){
                translate();
            }
            
            
            
            else{
                System.out.println("Unknown statement \n");
            }
            
        }
        
    }
    
    public void add(){
        System.out.print("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.print("Translation: ");
        String english = reader.nextLine();
        dict.add(finnish, english);
    } 
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + this.dict.translate(word) + "\n");
        
        
    }
    
    public void askForStatement(){
        System.out.print("Statement: ");
    }
    
    
}

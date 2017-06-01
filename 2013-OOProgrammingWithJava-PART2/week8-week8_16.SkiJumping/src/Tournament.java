
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Tournament {
    private List<Jumper> jumpers = new ArrayList<Jumper>();
    
    public Tournament(){
        
    }
    
    public void addJumper(Jumper jumper){
        jumpers.add(jumper);
    }
    
    public void printJumpingOrder(){
        for(int i = 1; i <= jumpers.size(); i++){
            System.out.println("  " + i + ". " + jumpers.get(i-1));
        }
        System.out.println("");
    }
    
    public void printRoundStatistics(){
        for(Jumper jumper:jumpers){
            jumper.jump();
            jumper.printRoundResults();
        }
        System.out.println("");
    }
    
    public void printFinalResults(){
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        sortJumpers();
        for(int i = jumpers.size()-1; i >=0; i--){
            System.out.println((jumpers.size()-i) + "           " + jumpers.get(i));
            System.out.print("            jump lengths: ");
            System.out.print(jumpers.get(i).getJumpLengths().get(0) + " m");
            for(int j = 1; j < jumpers.get(i).getJumpLengths().size(); j++){
                System.out.print(", " + jumpers.get(i).getJumpLengths().get(j) + " m");
            }
            System.out.println("");
        }
    }
    
    public void sortJumpers(){
        Collections.sort(jumpers);
    }
    
}

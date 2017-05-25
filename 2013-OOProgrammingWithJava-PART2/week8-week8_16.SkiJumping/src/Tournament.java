
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
            System.out.println(i + ". " + jumpers.get(i-1));
        }
    }
    
    public void printRoundStatistics(){
        for(Jumper jumper:jumpers){
            jumper.jump();
            jumper.printRoundResults();
        }
    }
    
    public void sortJumpers(){
        Collections.sort(jumpers);
    }
    
}

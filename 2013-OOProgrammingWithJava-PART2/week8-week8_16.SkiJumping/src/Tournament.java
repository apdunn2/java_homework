
import java.util.ArrayList;
import java.util.HashMap;

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
    private ArrayList<Jumper> jumpers = new ArrayList<Jumper>();
    
    public Tournament(){
        
    }
    
    public void addJumper(Jumper jumper){
        jumpers.add(jumper);
    }
}

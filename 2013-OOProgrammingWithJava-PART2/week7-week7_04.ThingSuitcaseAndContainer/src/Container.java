/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private int totalWeight = 0;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((totalWeight + suitcase.totalWeight()) <= maxWeight){
            suitcases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }    
    }
    
    public String toString(){
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printThings(){
        for(Suitcase suitcase:suitcases){
            suitcase.printThings();
        }
    }
    
    
    
    
}

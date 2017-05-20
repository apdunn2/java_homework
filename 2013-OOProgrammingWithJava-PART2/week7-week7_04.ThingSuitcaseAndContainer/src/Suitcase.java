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

public class Suitcase {
    private int maxWeight;
    private int totalWeight = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){
        if(totalWeight + thing.getWeight() <= maxWeight){
            things.add(thing);
            totalWeight += thing.getWeight();
        }    
    }
    
    public String toString(){
        if(things.size() == 0){
            return "empty (0 kg)";
        }else if(things.size() == 1){
            return things.size() + " thing (" + this.totalWeight + " kg)";
        }
        return things.size() + " things (" + this.totalWeight + " kg)";
    }
    
    public void printThings(){
        for(Thing thing:things){
            System.out.println(thing);
        } 
    }

    public int totalWeight() {
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        Thing heaviest = null;
        if(things.size() > 0){
            heaviest = things.get(0);
            for(Thing thing:things){
                if(heaviest.getWeight() < thing.getWeight()){
                    heaviest = thing;
                }
            }
        }
        return heaviest;
        
    }
    
    
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> things = new ArrayList<ToBeStored>();
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item){
        double weight = weight();
        if(weight+item.weight() <= this.maxWeight){
            things.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored item: things){
            weight += item.weight();
        } 
        return weight;
    }
    
    
    public String toString(){
        return "Box: " + things.size() + " things, total weight " + weight() + " kg" ;
    }
    
    
}

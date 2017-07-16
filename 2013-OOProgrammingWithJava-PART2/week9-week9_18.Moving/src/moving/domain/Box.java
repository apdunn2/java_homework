/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Box implements Thing{
    private int maxCap;
    private ArrayList<Thing> boxList;
    
    public Box(int maximumCapacity){
        this.boxList = new ArrayList<Thing>();
        this.maxCap = maximumCapacity;
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() > this.maxCap){
            return false;
        } else{
            boxList.add(thing);
            return true;
        }
    }
    
    public int getVolume(){
        int volume = 0;
        for(Thing thing:boxList){
            volume += thing.getVolume();
        }
        return volume;
    }
}

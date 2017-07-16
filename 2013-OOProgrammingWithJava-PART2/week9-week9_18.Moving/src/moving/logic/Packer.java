/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;
/**
 *
 * @author Andrew
 */
public class Packer {
    private int boxesVolume;
    private List<Box> boxes;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things){
        Box box = new Box(this.boxesVolume);        
        for(Thing thing:things){
            box.addThing(thing);
            this.boxes.add(box);
        }
        return this.boxes;
    }
}

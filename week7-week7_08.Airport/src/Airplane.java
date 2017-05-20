
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


public class Airplane {
    private int capacity;
    private String id;
    private ArrayList<String> flights = new ArrayList<String>();

    public Airplane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }
    
    public void addFlight(String departure, String destination){
        String flight = departure + "-" + destination;
        flights.add(flight);
    }

    public int getCapacity() {
        return capacity;
    }
    
    public void printFlights(){
        for(String flight:flights){
            System.out.println(id + " (" + capacity + " ppl) " + "(" + flight + ")");
        }
    }
    
    public String toString(){
        return id + " (" + capacity + " ppl)";
    }
    
    
    
    


    
}

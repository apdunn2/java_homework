
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
public class Airport {
    private HashMap<String, Airplane> planes = new HashMap<String, Airplane>();
    
    public Airport(){
        
    }
    
    public void addAirplane(String id, Airplane plane){
        planes.put(id, plane);
    }
    
    public void addFlight(String id, String departure, String destination){
        planes.get(id).addFlight(departure, destination);
    }
    
    public void printPlanes(){
        for(String key: planes.keySet()){
            System.out.println(key + " (" + planes.get(key).getCapacity() + " ppl)");     
        }
    }
    
    public void printFlights(){
        for(String key: planes.keySet()){
            planes.get(key).printFlights();
        }
    }
    
    public void printPlane(String id){
        System.out.println(planes.get(id).toString()); 
    }
}

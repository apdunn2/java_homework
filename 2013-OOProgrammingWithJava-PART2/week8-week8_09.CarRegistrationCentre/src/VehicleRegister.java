
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
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    
    public VehicleRegister(){
        
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate)==null){
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) != null){
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate:owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList<String>();
        for(RegistrationPlate plate:owners.keySet()){
            if(!ownerList.contains(owners.get(plate))){
                ownerList.add(owners.get(plate));
            }
        }
        for(String owner:ownerList){
            System.out.println(owner);
        }
    }
    
}

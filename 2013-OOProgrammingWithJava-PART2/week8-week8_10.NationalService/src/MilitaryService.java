/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class MilitaryService implements NationalService{
    private int daysOfService;
    
    public MilitaryService(int daysLeft){
        this.daysOfService = daysLeft;
    }
    
    public int getDaysLeft(){
        return daysOfService;
    }
    
    public void work(){
        if(daysOfService > 0){
            daysOfService--;
        }
    }
    
}


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
public class PromissoryNote {
    private HashMap<String, Double> loans = new HashMap<String, Double>();
    
    public PromissoryNote(){
        
    }

    public void setLoan(String toWhom, double value){
        loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.loans.containsKey(whose)){
            return this.loans.get(whose);
        }
        return 0;
    }
    
    
    
}

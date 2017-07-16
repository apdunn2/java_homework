
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;
import mooc.ui.UserInterface;

/**
 *
 * @author Andrew
 */
public class ApplicationLogic {
    private UserInterface interface1;
    
    public ApplicationLogic(UserInterface ui){
        this.interface1 = ui;
    }
    
    public void execute(int howManyTimes){
        for(int i =0; i < howManyTimes; i++){
            System.out.println("The application logic works");
            this.interface1.update();
        }
    }
}

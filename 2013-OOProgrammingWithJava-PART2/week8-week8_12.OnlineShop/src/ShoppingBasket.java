
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class ShoppingBasket {
    private Map<String, Purchase> basketItems;
    
    public ShoppingBasket(){
        basketItems = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(basketItems.containsKey(product)){
            basketItems.get(product).increaseAmount();
        }else{
            basketItems.put(product, new Purchase(product, 1, price));
        }
        
    }
    
    public int price(){
        int totalPrice = 0;
        for(Purchase purchase:basketItems.values()){
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Purchase purchase:basketItems.values()){
            System.out.println(purchase);
        }
    }
}

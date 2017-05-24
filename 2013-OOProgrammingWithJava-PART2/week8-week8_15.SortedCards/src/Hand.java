
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        for(Card card: cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int sum(){
        int sum = 0;
        for(Card card:cards){
            sum += card.getValue();
        }
        return sum;
    }
    
    public void sortAgainstSuit(){
       SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
       Collections.sort(this.cards, suitSorter);
    }
    
    public int compareTo(Hand hand){
        return this.sum() - hand.sum();
    }
    
    
}

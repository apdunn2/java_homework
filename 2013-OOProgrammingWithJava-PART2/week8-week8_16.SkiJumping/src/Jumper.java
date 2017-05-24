/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jumper {
    private String name;
    private int totalPoints;
    private Random random;
    
    public Jumper(String name){
        this.name = name;
    }
    
    public int lengthScore(){
        int length = random.nextInt(61) + 60;
        return length;
    }
    
    public int judgesScores(){
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            int score = random.nextInt(11) + 10;
            scores.add(score);            
        }
        Collections.sort(scores);
        scores.remove(4);
        scores.remove(0);
        return sum(scores);
    }
    
    public int sum(ArrayList<Integer> list){
        int sum = 0;
        for(Integer num:list){
            sum+=num;
        }
        return sum;
    }
    
    public void jump(){
        this.totalPoints += judgesScores() + lengthScore();
    }
}

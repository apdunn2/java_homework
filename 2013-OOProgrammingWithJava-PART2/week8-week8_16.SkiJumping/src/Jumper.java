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

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int totalPoints;
    private Random random;
    private int roundLength;
    private ArrayList<Integer> roundJudgesScores;
    private ArrayList<Integer> jumpLengths;
    
    public Jumper(String name){
        this.name = name;
        this.random = new Random();
        this.jumpLengths = new ArrayList<Integer>();
    }
    
    public int lengthScore(){
        int length = random.nextInt(61) + 60;
        this.jumpLengths.add(length);
        this.roundLength = length;
        return length;
    }
    
    public int judgesScores(){
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int num  = random.nextInt(12);
        for(int i = 0; i < 5; i++){
            Integer score = random.nextInt(11) + 10;
            scores.add(score);            
        }
        this.roundJudgesScores = new ArrayList(scores);
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
    
    public void printRoundResults(){
        System.out.println("  " + this.name);
        System.out.println("    length: " + this.roundLength);
        System.out.println("    judge votes: " + this.roundJudgesScores);
    }
    
    public void jump(){
        this.totalPoints += judgesScores() + lengthScore();
    }

    public String getName() {
        return name;
    }
    
    public int compareTo(Jumper jumper){
        return this.totalPoints - jumper.totalPoints;
    }
    
    public String toString(){
        return this.name + " (" + this.totalPoints + " points)";
    }

    public ArrayList<Integer> getJumpLengths() {
        return jumpLengths;
    }
    
    
}

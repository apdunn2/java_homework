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
import java.util.Arrays;

public class Gradebook {
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public Gradebook(){
        
    }
    
    public void addGrade(int score){
        grades.add(score);
    }
    
    public int[] distribute(){
        int[] distribution = new int[6];
        Arrays.fill(distribution, 0);
        for(int grade:grades){
            distribution[checkScore(grade)]++;
        }
        return distribution;
        
    }
    
    public int checkScore(int score){
        int grade;
        if(score < 30){
            grade = 0;
        }else if(score < 35){
            grade = 1;
        }else if(score < 40){
            grade = 2;
        }else if(score < 45){
            grade = 3;
        }else if(score < 50){
            grade = 4;
        }else{
            grade = 5;
        }
        return grade;
    }
    
    public void printDistribution(int[] distribution){
        System.out.println("Grade Distribution:");
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for(int j = distribution[i]; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

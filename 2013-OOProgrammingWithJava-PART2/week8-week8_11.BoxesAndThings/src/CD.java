/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int year;
    private double weight;
    
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = .1;
    }
    
    public double weight(){
        return weight;
    }
    
    public String toString(){
        return artist + ": " + title + " (" + year + ")";
    }
    
}


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
public class Dictionary {
    private HashMap<String, String> englishToFinnish = new HashMap<String, String>();
    
    public Dictionary(){
        
    }
    
    public String translate(String word){
        if(englishToFinnish.containsKey(word)){
            return englishToFinnish.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        englishToFinnish.put(word, translation);
    }
    
    public int amountOfWords(){
        return englishToFinnish.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> completeDictionaryList = new ArrayList<String>();
        for(String key:englishToFinnish.keySet()){
            completeDictionaryList.add(key + " = " + englishToFinnish.get(key));
        }
        return completeDictionaryList;
    }
    
    
}


public class Smileys {

    public static void main(String[] args) {
        
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        if(characterString.length() % 2 == 0){
            printSmileysEven(characterString);
        }
        else{
            printSmileysOdd(characterString);
        }
    }
    
    private static void printSmileyRow(int rowLength){
        for(int i = 0; i < rowLength; i++){
            System.out.print(":)");
        }
        System.out.println("");
    }
    
    private static void printSmileysEven(String charString){
        int smileys = 3+(charString.length()/2);
        printSmileyRow(smileys);
        System.out.println(":) " + charString + " :)");
        printSmileyRow(smileys);    
    }
    
    private static void printSmileysOdd(String charString){
        int smileys = ((charString.length()-1)/2)+4;
        printSmileyRow(smileys);
        System.out.println(":) " + charString + "  :)");
        printSmileyRow(smileys); 
    }

}

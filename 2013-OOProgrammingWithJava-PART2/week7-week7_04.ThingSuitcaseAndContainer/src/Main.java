
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
    }
   
    public static void addSuitcasesFullOfBricks(Container container){
        int i = 0;
        while(i < 100){
            Thing thing = new Thing("Brick", i+1);
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(thing);
            container.addSuitcase(suitcase);
            i++;
        }
    }
    
}

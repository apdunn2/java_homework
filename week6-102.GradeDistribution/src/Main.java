import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes: ");
        Gradebook gradebook = new Gradebook();
        while(true){
            int score = Integer.parseInt(reader.nextLine());
            if(score ==-1){
                break;
            }
            gradebook.addGrade(score);    
        }
        int[] distribution = gradebook.distribute();
        gradebook.printDistribution(distribution);
    }
}

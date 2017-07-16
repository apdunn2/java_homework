import java.util.Scanner;


public class TextInterface {
	private Scanner reader;
	
	public TextInterface(Scanner reader){
		this.reader = reader;
	}
	
	public void start(){
		while(true){
			printHomeMenu();
			int command = Integer.parseInt(reader.nextLine());
			if(command == 1){
				AutoInsuranceSale();
			}
		}	
		
	}
	
	public void printHomeMenu(){
		System.out.println("---------------------------------------");
		System.out.println("Welcome to the Parkland Insurance Sales");
		System.out.println("---------------------------------------");
		System.out.println("Enter any of the following commands: ");
		System.out.println("1) Enter auto insurance sale ");
		System.out.println("2) Enter home insurance sale");
		System.out.println("3) Enter life insurance sale ");
		System.out.println("4) Print all sales entered");
		System.out.println("5) Quit");
	}
}

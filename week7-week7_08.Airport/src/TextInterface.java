/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class TextInterface {
    private Scanner reader;
    private Airport airport;
    
    public TextInterface(Scanner reader, Airport airport){
        this.reader = reader;
        this.airport = airport;
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        airportPanel();
        System.out.print("\nFlight service\n------------\n");
        flightServicePanel();
        
    }
    
    public void chooseOperationAirportPanel(){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
    
    public void chooseOperationFlightService(){
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
    
    public void addAirplane(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        airport.addAirplane(id, new Airplane(id, capacity));
    }
    
    public void addFlight(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        this.airport.addFlight(id, departure, destination);
    }
    
    public void airportPanel(){
        while(true){
            chooseOperationAirportPanel();
            String command = reader.nextLine();
            if(command.equals("1")){
                addAirplane();
            }else if(command.equals("2")){
                addFlight();
            }else{
                break;
            }
        }
    }
    
    public void flightServicePanel(){
        while(true){
            chooseOperationFlightService();
            String command = reader.nextLine();
            if(command.equals("1")){
                printPlanes();
            }else if(command.equals("2")){
                printFlights();
            }else if(command.equals("3")){
                printPlane();
            }else{
                break;
            }
            
        }
    }
    
    public void printPlanes(){
        airport.printPlanes();
    }
    
    public void printFlights(){
        airport.printFlights();
    }
    
    public void printPlane(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        airport.printPlane(id);
    }
    
    
}

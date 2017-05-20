/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
import java.util.Scanner;

public class Calculator {
    private Reader reader;
    private int count;
    
    public Calculator(){
        this.reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                count++;
            } else if (command.equals("difference")) {
                difference();
                count++;
            } else if (command.equals("product")) {
                product();
                count++;
            }
        }

        statistics();
    }
    
    private void sum(){
        System.out.print("value1: ");
        int num1 = reader.readInteger();
        System.out.print("value2: ");
        int num2 = reader.readInteger();
        System.out.println("sum of values " + (num1 + num2));
    }
    
    private void difference(){
        System.out.print("value1: ");
        int num1 = reader.readInteger();
        System.out.print("value2: ");
        int num2 = reader.readInteger();
        System.out.println("difference of values " + (num1 - num2));
    }
    
    private void product(){
        System.out.print("value1: ");
        int num1 = reader.readInteger();
        System.out.print("value2: ");
        int num2 = reader.readInteger();
        System.out.println("product of values " + (num1 * num2));
    }
    
    private void statistics(){
        System.out.println("Calculations done " + count);
    }
    
    
    
}

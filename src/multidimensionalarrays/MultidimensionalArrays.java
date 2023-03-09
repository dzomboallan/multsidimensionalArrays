/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

/**
 *
 * @author hunnytaggy
 */
import java.util.Scanner;

public class MultidimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        char choice;
        
        double [][] temperature = new double [4][7];
        
        do{
            System.out.println();
            System.out.println("[1] Enter temperatures");
            System.out.println("[2] Display all");
            System.out.println("[3] Display one week");
            System.out.println("[4] Display day of the week");
            System.out.println("[5] Exit");
            System.out.println("Enter choise 1-5: ");
            
            choice = keyboard.next().charAt(0);
            
            switch(choice){
                case '1': enterTemps(temperature);
                          break;
                case '2': displayAllTemps(temperature);
                          break;
                case '3': displayWeek(temperature);
                          break;
                case '4': displayDays(temperature);
                          break;
                case '5': System.out.println("Goodbye");
                          break;
                default: System.out.println("ERROR: options 1-5 only!");
            }
        }while(choice !='5');
    }

    static void enterTemps(double[][] temperatureIn) {
        Scanner keyboard = new Scanner (System.in);
        
        for(int week =1 ;week <= temperatureIn.length; week++){
            for(int day = 1; day <= temperatureIn[0].length; day++){
                System.out.println("enter temperature for week "+week+" and day "+day);
                temperatureIn[week-1][day-1] = keyboard.nextDouble();
            }
        }
    }

    static void displayAllTemps(double[][] temperatureIn) {
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED ***");
        for(int week = 1; week <= temperatureIn.length; week++){
            for(int day = 1; day <= temperatureIn[0].length; day++){
                System.out.println("Week "+week+" day "+day+": "+temperatureIn[week-1][day-1]);
            }
        }
    }

    static void displayWeek(double[][] temperatureIn) {
        Scanner keyboard = new Scanner (System.in);
        int week;
        
        System.out.println("Enter week number (1-4): ");
        week = keyboard.nextInt();
        
        while(week<1 || week>4){
            System.out.println("Invalid week number!!");
            System.out.println("Enter again (1-4 only): ");
            week = keyboard.nextInt();
        }
        
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED FOR WEEK "+week+" ***");
        System.out.println();
        
        for(int day = 1; day <= temperatureIn[0].length; day++){
            System.out.println("week "+week+" day "+day+":"+temperatureIn[week-1][day-1]);
        }
    }

    static void displayDays(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        int day;
        
        System.out.println("Enter day number (1-7): ");
        day = keyboard.nextInt();
        
        while(day<1 || day>7){
            System.out.println("Invalid day number!!");
            System.out.println("Enter again (1-7 only): ");
            day = keyboard.nextInt();
        }
        
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED FOR DAY "+day+" ***");
        System.out.println();
        
        for(int week = 1; week <= temperatureIn.length; week++){
            System.out.println("week "+week+" day "+day+":"+temperatureIn[week-1][day-1]);
        }
    }
    
}

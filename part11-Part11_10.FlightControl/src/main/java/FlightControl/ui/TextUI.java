package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;

public class TextUI {
    
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    // starts the User Interface
    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    // UI for Asset Control, makes use of methods addAirplane(), addFlight()
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String action = scanner.nextLine();

            if (action.equals("1")) {
                addAirplane();
            } else if (action.equals("2")) {
                addFlight();  
            } else if (action.equals("x")) {
                break;
            } else {
                continue;
            }
        }

    }

    // method to add airplane within the UI, makes use of addAirplane() from FlightControl Class
    private void addAirplane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    // method to add flight within the UI, makes use of addFlight() from FlightControl Class
    // uses askForAirplane(Scanner) method to help find if Airplane is valid
    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane(scanner); // looks for airplane by using ID
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    // looks for airplane by using ID and pulling from HashMap in FlightControl
    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }

    // UI for FLightControl, makes use of methods printAirplanes(), printFlights(), printAirplaneDetails()
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    // returns the values of HasMap<Airplane> from FlightControl class
    private void printAirplanes() {
        for (Airplane plane : this.flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    // returns the values of HasMap<Flight> from FlightControl class
    private void printFlights() {
        for (Flight flight : this.flightControl.getFlights()) {
            System.out.println(flight);
        }
    }

    // prints details for one specific airplane in HasMap<Airplane> FlightControl class
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane(scanner);
        System.out.println(plane);
        System.out.println();
    }
}

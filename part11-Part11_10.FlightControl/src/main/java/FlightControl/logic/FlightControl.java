package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    // adds new airplane by using Airplane class parameters
    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.planes.put(ID, plane);
    } 

    // adds a flight by taking Airplane object and Place parameters. It implements the ID information to this.places
    // in order to create a new Flight object. 
    public void addFlight(Airplane plane, String originID, String destinID) {
        this.places.putIfAbsent(originID, new Place(originID));
        this.places.putIfAbsent(destinID, new Place(destinID));

        Flight flight = new Flight(plane, this.places.get(originID), this.places.get(destinID));
        this.flights.put(flight.toString(), flight);
    }

    // gets the values of all airplanes from HashMap this.planes
    public Collection<Airplane> getAirplanes() {
        return this.planes.values();
    }

    // gets the values of all flights from HashMap this.flights
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    // returns one Airplane object by using the key (ID) from the HashMap this.planes
    public Airplane getAirplane(String ID) {
        return this.planes.get(ID);
    }
}

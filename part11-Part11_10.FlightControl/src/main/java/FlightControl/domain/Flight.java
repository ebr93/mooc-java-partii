package FlightControl.domain;

public class Flight {
    private Airplane plane;
    private Place originAirport;
    private Place destinationAirport;

    public Flight(Airplane plane, Place originAirport, Place destinationAirport) {
        this.plane = plane;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airplane getPlane() {
        return this.plane;
    }

    public Place getOriginAirport() {
        return this.originAirport;
    }

    public Place getDestinationAirport() {
        return this.destinationAirport;
    }

    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.originAirport + "-" + this.destinationAirport + ")";
    }
}

package WS;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    int id;
    String flightNumber,passengerNumber, seatNumber;

    public Booking(int id, String flightNumber, String passengerNumber, String seatNumber) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.passengerNumber = passengerNumber;
        this.seatNumber = seatNumber;
    }

    public Booking() {
    }
    List<Booking> init(){
        List<Booking> l = new ArrayList<>();
        l.add(new Booking(1, "001", "c100", "s100"));
        l.add(new Booking(2, "002", "c101", "s101"));
        l.add(new Booking(3, "003", "c102", "s102"));
        return l;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(String passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}



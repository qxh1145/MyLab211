package week5.shortP107;

import java.time.LocalDateTime;

public class FlightInformation {
    protected String flightNumber;
    protected int seatNumber;
    protected LocalDateTime timePickup;



    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = 0;
        this.timePickup = LocalDateTime.now();
    }

    public FlightInformation(String flightNumber, int seatNumber, LocalDateTime timePickup) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickup = timePickup;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public LocalDateTime getTimePickup() {
        return this.timePickup;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTimePickup(LocalDateTime timePickup) {
        this.timePickup = timePickup;
    }
    public String toString() {
        return String.format("Flight Number: %-10s | Seat Number: %-10s | Time Pickup: %-10s | :",
                this.flightNumber,this.seatNumber,this.timePickup);
    }
}

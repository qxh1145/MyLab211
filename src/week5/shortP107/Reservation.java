package week5.shortP107;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private LocalDate bookingDate;
    private FlightInformation flightInformation;

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = "";
        this.bookingDate = LocalDate.now();
        this.flightInformation = null;
    }

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, LocalDate bookingDate, FlightInformation flightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInformation = flightInformation;
    }

    public String getBookingID() {
        return this.bookingID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public LocalDate getBookingDate() {
        return this.bookingDate;
    }

    public FlightInformation getFlightInformation() {
        return this.flightInformation;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

    public String toString() {
        return String.format("Booking ID: %-10s | Customer Name: %-10s | Phone Number: %-10s | Room Number: %-10s | Booking Date: %-10s | Flight Information: %-10s | :",
                this.bookingID,this.customerName,this.phoneNumber,this.roomNumber,this.bookingDate,this.flightInformation);
    }

}

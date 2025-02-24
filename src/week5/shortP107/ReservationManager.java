package week5.shortP107;

import week5.shortP109.view.Validation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReservationManager {

    ArrayList<Reservation> reservations = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public void addReservation() {
        System.out.println("**Create new reservation**");
        String id;

        while (true) {
            System.out.println("Enter ID: ");
            id = input.nextLine();
            String finalId = id;
            if (id.matches("\\d{6}") || reservations.stream().anyMatch(r -> r.getBookingID().equals(finalId))) {
                break;
            }
            System.out.println("Invalid");
        }
        String name;
        while (true) {
            System.out.println("Enter name: ");
            name = input.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            }
            System.out.println("Invalid");
        }
        String phone;
        while (true){
            System.out.println("Enter phone number: ");
            phone = input.nextLine();
            if (phone.matches("\\d{12}")) {
                break;
            }
            System.out.println("Invalid");
        }
        String room;
        while (true) {
            System.out.println("Enter room number: ");
            room = input.nextLine();
            if (room.matches("\\d{4}")) {
                break;
            }
            System.out.println("Invalid");
        }
        LocalDate bookingDate;
        while (true){
            System.out.println("Enter booking date: ");
            String date = input.nextLine();
            try {
                bookingDate = LocalDate.parse(date, formatter1);
                if (bookingDate.isBefore(LocalDate.now())) {
                    break;
                }
                System.out.println("Invalid");
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format");
            }
        }


        System.out.println("Need airport pickup (Y/N): ");
        String airportPickup = input.nextLine();

        FlightInformation flightInformation = null;
        if (airportPickup.equalsIgnoreCase("Y")) {
            System.out.println("Enter flight number: ");
            String flightNumber = input.nextLine();
            System.out.println("Enter seat number: ");
            int seatNumber = Integer.parseInt(input.nextLine());
            LocalDateTime timePickup;
            while (true) {
                System.out.println("Enter time pickup: ");
                timePickup= LocalDateTime.parse(input.nextLine(), formatter);
                if (timePickup.isBefore(ChronoLocalDateTime.from(bookingDate))) {
                    break;
                }
                System.out.println("Invalid");
            }
            flightInformation = new FlightInformation(flightNumber, seatNumber, timePickup);
        }
        Reservation reservation = new Reservation(id, name, phone, room, bookingDate, flightInformation);
        reservations.add(reservation);
        System.out.println("Information saved successfully!");
    }

    public void updateReservation() {
        System.out.println("Enter booking ID to find: ");
        String bookingID = input.nextLine();
        for (Reservation reservation : reservations) {
            if (reservation.getBookingID().equals(bookingID)) {
                System.out.println("**Update reservation**");
                System.out.println("If you dont want to update information, just press enter to skip");

                String name;
                while (true) {
                    System.out.println("Enter name: ");
                    name = input.nextLine();
                    if (name.equals(" ")) {
                        name = reservation.getCustomerName();
                    }
                    if (name.matches("[a-zA-Z ]+")) {
                        break;
                    }
                    System.out.println("Invalid");
                }
                String phone;
                while (true) {
                    System.out.println("Enter phone number: ");
                    phone = input.nextLine();
                    if (phone.equals(" ")) {
                        phone = reservation.getPhoneNumber();
                    }
                    if (phone.matches("\\d{12}")) {
                        break;
                    }
                    System.out.println("Invalid");
                }
                String room;
                while (true) {
                    System.out.println("Enter room number: ");
                    room = input.nextLine();
                    if (room.equals(" ")) {
                        room = reservation.getRoomNumber();
                    }
                    if (room.matches("\\d{4}")) {
                        break;
                    }
                    System.out.println("Invalid");
                }
                LocalDate bookingDate;
                while (true) {
                    System.out.println("Enter booking date: ");
                    bookingDate = LocalDate.parse(input.nextLine(), formatter1);
                    if (bookingDate.equals(" ")){
                        bookingDate = reservation.getBookingDate();
                    }
                    if (bookingDate.isBefore(ChronoLocalDate.from(LocalDateTime.now()))) {
                        break;
                    }
                    System.out.println("Invalid");
                }


                System.out.println("Need airport pickup (Y/N): ");
                String airportPickup = input.nextLine();

                FlightInformation flightInformation = null;
                if (airportPickup.equalsIgnoreCase("Y")) {
                    System.out.println("Enter flight number: ");
                    String flightNumber = input.nextLine();
                    System.out.println("Enter seat number: ");
                    int seatNumber = Integer.parseInt(input.nextLine());
                    LocalDateTime timePickup;
                    while (true) {
                        System.out.println("Enter time pickup: ");
                        timePickup = LocalDateTime.parse(input.nextLine(), formatter);
                        if (timePickup.isBefore(ChronoLocalDateTime.from(bookingDate))) {
                            break;
                        }
                        System.out.println("Invalid");
                    }
                    reservation.setCustomerName(name);
                    reservation.setPhoneNumber(phone);
                    reservation.setRoomNumber(room);
                    reservation.setBookingDate(bookingDate);
                    reservation.setFlightInformation(new FlightInformation(flightNumber, seatNumber, timePickup));
                    return;
                }
            }else {
                System.err.println("No information found");;
                System.out.println("Do you want to find again? (Y/N): ");
                String check = input.nextLine();
                if (check.equalsIgnoreCase("N")) {
                    return;
                }else {
                    updateReservation();
                }
            }
        }
    }
    public void deleteReservation(){
        System.out.println("Enter booking ID to find: ");
        String bookingID = input.nextLine();
        for (Reservation reservation : reservations) {
            if (reservation.getBookingID().equals(bookingID)) {
                reservations.remove(reservation);
                System.out.println("Information deleted successfully!");
                return;
            }
        }
        System.out.println("Information not found!");
    }

    public void prinntFlightInformation(){
        System.out.println("Enter booking ID to find: ");
        String bookingID = input.nextLine();
        for (Reservation reservation : reservations) {
            if (reservation.getBookingID().equals(bookingID)) {
                System.out.println(reservation.getFlightInformation());
                return;
            }
        }
        System.out.println("Information not found!");
    }
    public void printAll() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}

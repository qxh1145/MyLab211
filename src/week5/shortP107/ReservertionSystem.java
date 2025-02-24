package week5.shortP107;

import java.util.Scanner;

public class ReservertionSystem {
    public static void main(String[] args) {
        ReservationManager reservationManager = new ReservationManager();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("** Reservation System **");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight information");
            System.out.println("5. Print all reservation");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> reservationManager.addReservation();
                case 2 -> reservationManager.updateReservation();
                case 3 -> reservationManager.deleteReservation();
                case 4 -> reservationManager.prinntFlightInformation();
                case 5 -> reservationManager.printAll();
                case 6 -> {
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

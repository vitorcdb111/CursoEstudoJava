package secao15Excecoes;

import entities.secao15Excecoes.Reservation;
import entities.secao15Excecoes.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) { //throws ParseException {
        /*
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Metodo muito ruim:
        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/mm/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/mm/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if(!checkout.after(checkin))
        {
            System.out.println("Error in reservation: Chek-out date must be after check-in date");
        }
        else
        {
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.println("Check-in date (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            Date dateNow = new Date();
            if(checkin.before(dateNow) || checkout.before(dateNow))
            {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else if(!checkout.after(checkin))
            {
                System.out.println("Error in reservation: Chek-out date must be after check-in date");
            }
            else
            {
                reservation.updateDates(checkin, checkout);
                System.out.println("Reservation: " + reservation);
            }
        }


        sc.close();
         */

        /*
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Metodo ruim:
        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/mm/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/mm/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if(!checkout.after(checkin))
        {
            System.out.println("Error in reservation: Chek-out date must be after check-in date");
        }
        else
        {
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.println("Check-in date (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            String error = reservation.updateDates(checkin, checkout);
            if(error != null)
            {
                System.out.println("Error in reservation: " + error);
            }
            else
            {
                System.out.println("Reservation: " + reservation);
            }
        }


        sc.close();
         */

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Metodo bom:
        try
        {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/mm/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/mm/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.println("Check-in date (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        }
        catch(ParseException e)
        {
            System.out.println("Invalid date format");
        }
        catch(DomainException e)
        {
            System.out.println("Error in reservation: " + e.getMessage());
        }

        sc.close();
    }
}

package entities.secao15Excecoes;

import entities.secao15Excecoes.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation()
    {
    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException{
        if(!checkout.after(checkin))
        {
            throw new DomainException("Chek-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration()
    {
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) throws DomainException
    {
        /*
        //Metodo ruim
        Date dateNow = new Date();
        if(checkin.before(dateNow) || checkout.before(dateNow))
        {
            return "Reservation dates for update must be future dates";
        }
        if(!checkout.after(checkin))
        {
            return "Chek-out date must be after check-in date";
        }

        this.checkin = checkin;
        this.checkout = checkout;

        return null;
         */

        Date dateNow = new Date();
        if(checkin.before(dateNow) || checkout.before(dateNow))
        {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if(!checkout.after(checkin))
        {
            throw new DomainException("Chek-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString()
    {
        return "Room "
            + roomNumber
            + ", check-in: "
            + sdf.format(checkin)
            + ", check-out: "
            + sdf.format(checkout)
            + ", "
            + duration()
            + " nights";
    }

}

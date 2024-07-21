package model;

import java.time.LocalDateTime;

public class Reservation {
    public static int idCounter=0;
    public LocalDateTime creationDate;
    public String reservationNumber;
    public Flight flight;
    public Seat seats;
    public Airport destinationAirport;
    public Airport sourceAirport;
    public Customer customer;

    public Reservation(LocalDateTime creationDate,Flight flight,Seat seat,Airport destinationAirport,Airport sourceAirport,Customer customer){
        this.destinationAirport = destinationAirport;
        this.sourceAirport = sourceAirport;
        this.flight = flight;
        this.creationDate  = creationDate;
        this.seats = seat;
        this.reservationNumber = String.valueOf(idCounter);
        this.customer = customer;
    }

    public String getReservationNumber(){
        return reservationNumber;
    }
    public Flight geFlight(){
        return flight;
    }
    public Seat getSeats(){
        return seats;
    }
}

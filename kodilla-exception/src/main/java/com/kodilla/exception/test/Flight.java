package com.kodilla.exception.test;

import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport,String arrivalAirport){
        this.arrivalAirport=arrivalAirport;
        this.departureAirport=departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
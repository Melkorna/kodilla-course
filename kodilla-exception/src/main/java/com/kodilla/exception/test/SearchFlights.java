package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {

    boolean findFlights(Flight flight)throws RouteNotFoundException{
        Map<String,Boolean> AirMap = new HashMap<>();
        AirMap.put("Wroclaw",false);
        AirMap.put("Warsaw",true);
        AirMap.put("Gdansk",false);
        AirMap.put("Poznan",true);
        if (AirMap.get(flight.getArrivalAirport()).equals(AirMap.containsKey(flight.getArrivalAirport()))){
            return true;
        }
        System.out.println("Flight: " + flight.getArrivalAirport() + " "+"not exist");
        throw new RouteNotFoundException();
    }
    public static void main(String[]args) throws RouteNotFoundException {
        Flight flight1 =new Flight("Wroclaw","Gdansk");
        Flight flight2 = new Flight("Gdansk","French");
        Flight flight4 = new Flight("Warsaw","Poznan");
        SearchFlights searchFlights =new SearchFlights();
        try {
            System.out.println(searchFlights.findFlights(flight1));
            System.out.println(searchFlights.findFlights(flight2));
            System.out.println(searchFlights.findFlights(flight4));
        }catch (RouteNotFoundException e){
            System.out.println("This flights aren't exist");
        }
    }
}

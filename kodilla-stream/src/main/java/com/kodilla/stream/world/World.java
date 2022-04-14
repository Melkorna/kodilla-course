package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinent (Continent continent){
        continents.add(continent);

    }

    public Set<String> getAllContinents(){
        return continents.stream()
                .map(Continent::getContinentName)
                .collect(Collectors.toSet());
    }

    public BigDecimal getAllQuantityPeople(){
        BigDecimal totalQuantityPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current)->sum=sum.add(current));
        return totalQuantityPeople;


    }
}

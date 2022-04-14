package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetCountriesOfContinent() {

        // Given
        Continent southAmerica = new Continent("South America");
            Country brasil = new Country(new BigDecimal(100000), "Brasil");

        Continent northAmeriaca = new Continent("North Ameriaca");
            Country uSA = new Country(new BigDecimal(1000002),"USA");

        Continent europe = new Continent("Europe");
            Country poland = new Country(new BigDecimal(125400),"Poland");
            Country ukraine = new Country( new BigDecimal(4561231),"Ukraine");

        Continent asia = new Continent("Asia");

            Country japonia = new Country( new BigDecimal(56464314),"Japonia");
            Country chiny = new Country(new BigDecimal(1000000),"Chiny" );

        Continent africa = new Continent("Africa");

            Country nigeria = new Country(new BigDecimal(15315641),"Nigeria");
            Country kenia = new Country(new BigDecimal(6545644),"Kenia" );

        World world = new World();

        // Then

        europe.addContry(poland);
        europe.addContry(ukraine);

        africa.addContry(nigeria);
        africa.addContry(kenia);

        northAmeriaca.addContry(uSA);

        southAmerica.addContry(brasil);

        asia.addContry(chiny);
        asia.addContry(japonia);


        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(northAmeriaca);
        world.addContinent(southAmerica);
        world.addContinent(asia);

        //Then

        Assertions.assertEquals(new BigDecimal("125400"), poland.getPeopleQuantity());
        Assertions.assertEquals(new BigDecimal("4561231"), ukraine.getPeopleQuantity());
        Assertions.assertEquals(2, europe.getCountries().size());
        Assertions.assertEquals(new BigDecimal("4686631"), europe.getContinentPeopleQuantity());
        System.out.println(europe.getCountries() + " EUROPE population = " + europe.getContinentPeopleQuantity());


        Assertions.assertEquals(new BigDecimal("15315641"), nigeria.getPeopleQuantity());
        Assertions.assertEquals(new BigDecimal("6545644"), kenia.getPeopleQuantity());
        Assertions.assertEquals(2, africa.getCountries().size());
        Assertions.assertEquals(new BigDecimal("21861285"), africa.getContinentPeopleQuantity());
        System.out.println(africa.getCountries() + " Africa population = " + africa.getContinentPeopleQuantity());


        Assertions.assertEquals(new BigDecimal("100000"), brasil.getPeopleQuantity());
        Assertions.assertEquals(1, southAmerica.getCountries().size());
        Assertions.assertEquals(new BigDecimal("100000"), southAmerica.getContinentPeopleQuantity());
        System.out.println(southAmerica.getCountries() + " Sounth America population = " + southAmerica.getContinentPeopleQuantity());


        Assertions.assertEquals(new BigDecimal("1000002"), uSA.getPeopleQuantity());
        Assertions.assertEquals(1,northAmeriaca.getCountries().size());
        Assertions.assertEquals(new BigDecimal("1000002"),northAmeriaca.getContinentPeopleQuantity());
        System.out.println(northAmeriaca.getCountries() + " North America population = " + northAmeriaca.getContinentPeopleQuantity());

        Assertions.assertEquals(new BigDecimal("56464314"),japonia.getPeopleQuantity());
        Assertions.assertEquals(new BigDecimal("1000000"),chiny.getPeopleQuantity());
        Assertions.assertEquals(2, asia.getCountries().size());
        Assertions.assertEquals(new BigDecimal("57464314"),asia.getContinentPeopleQuantity());
        System.out.println(asia.getCountries() + " North America population = " + asia.getContinentPeopleQuantity());




    }
}

package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.io.*;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @DisplayName("W poniżsyzm kodzie sprawdzam czy dwie puste liste sobie równe")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);

        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);

        //Then
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        Assert.assertEquals(resultList, expectedList);
    }

}

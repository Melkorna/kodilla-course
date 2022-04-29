package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandling {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge challenge = new SecondChallenge();

        //When/Then
        Assertions.assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1.5, 1.5)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(10, 10)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.5, 1)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.1, 1))
        );
    }
}

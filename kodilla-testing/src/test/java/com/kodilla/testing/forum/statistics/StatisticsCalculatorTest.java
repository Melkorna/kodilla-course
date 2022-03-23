package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StatisticsCalculatorTest {

    @Mock
    Statistics statistics;

    @Test
    void test() {
        //given


        when(statistics.commentsCount()).thenReturn(20);
        when(statistics.postsCount()).thenReturn(0);
        List<String> userNames = Arrays.asList("Jeden", "Dwa");
        when(statistics.usersNames()).thenReturn(userNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);

        //then
        assertEquals(0, statisticsCalculator.getNumberOfPosts());
        assertEquals(20, statisticsCalculator.getNumbersOfComments());
        assertEquals(2,statisticsCalculator.getNumberOfUsers());
        assertEquals(0, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(10, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

    @Test

    void whenCountPosts1000(){
        //given
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        List<String> userNames = Arrays.asList("Jeden", "Dwa","Olek","Ewa");
        when(statistics.usersNames()).thenReturn(userNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);
        //then
        assertEquals(1000, statisticsCalculator.getNumberOfPosts());
        assertEquals(12, statisticsCalculator.getNumbersOfComments());
        assertEquals(4,statisticsCalculator.getNumberOfUsers());
        assertEquals(250, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(3, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0.012, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

    @Test
    void whenComments0() {
        //given
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(1000);
        List<String> userNames = Arrays.asList("Jeden", "Dwa", "Olek", "Ewa");
        when(statistics.usersNames()).thenReturn(userNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);
        //then
        assertEquals(1000, statisticsCalculator.getNumberOfPosts());
        assertEquals(0, statisticsCalculator.getNumbersOfComments());
        assertEquals(4, statisticsCalculator.getNumberOfUsers());
        assertEquals(250, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(0, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

    @Test
    void whenCountCommentsMoreCountPosts() {
        //given
        when(statistics.commentsCount()).thenReturn(8);
        when(statistics.postsCount()).thenReturn(4);
        List<String> userNames = Arrays.asList("Jeden", "Dwa", "Olek", "Ewa");
        when(statistics.usersNames()).thenReturn(userNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);
        //then
        assertEquals(4, statisticsCalculator.getNumberOfPosts());
        assertEquals(8, statisticsCalculator.getNumbersOfComments());
        assertEquals(4, statisticsCalculator.getNumberOfUsers());
        assertEquals(1, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(2, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(2, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

    @Test
    void whenCountCommentsLessCountPosts() {
        //given
        when(statistics.commentsCount()).thenReturn(4);
        when(statistics.postsCount()).thenReturn(8);
        List<String> userNames = Arrays.asList("Jeden", "Dwa", "Olek", "Ewa");
        when(statistics.usersNames()).thenReturn(userNames);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);
        //then
        assertEquals(8, statisticsCalculator.getNumberOfPosts());
        assertEquals(4, statisticsCalculator.getNumbersOfComments());
        assertEquals(4, statisticsCalculator.getNumberOfUsers());
        assertEquals(2, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(1, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(0.5, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

    @Test
    void whenUsersCount0() {
        //given
        List<String> listOfUsers = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(4);
        when(statistics.postsCount()).thenReturn(4);
        when(statistics.usersNames()).thenReturn(listOfUsers);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);
        //then
        assertEquals(4, statisticsCalculator.getNumberOfPosts());
        assertEquals(4, statisticsCalculator.getNumbersOfComments());
        assertEquals(0, statisticsCalculator.getNumberOfUsers());
        assertEquals(0, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(0, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(1, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

    @Test
    void whenUsersCount100() {
        //given
        List<String> listOfUsers = new ArrayList<>();
        for (int i =0; i<100;i++){
            listOfUsers.add("User");
        }
        when(statistics.commentsCount()).thenReturn(4);
        when(statistics.postsCount()).thenReturn(4);
        when(statistics.usersNames()).thenReturn(listOfUsers);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //when
        statisticsCalculator.calculateAdvStatistics(statistics);
        //then
        assertEquals(4, statisticsCalculator.getNumberOfPosts());
        assertEquals(4, statisticsCalculator.getNumbersOfComments());
        assertEquals(100, statisticsCalculator.getNumberOfUsers());
        assertEquals(0.04, statisticsCalculator.getAverageNumberOfPostsPerUser());
        assertEquals(0.04, statisticsCalculator.getAverageNumberOfCommentsPerUser());
        assertEquals(1, statisticsCalculator.getAverageNumberOfCommentsPerPosts());
    }

}
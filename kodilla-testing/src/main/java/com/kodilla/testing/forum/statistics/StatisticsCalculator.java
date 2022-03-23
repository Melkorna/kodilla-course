package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numbersOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPosts;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumbersOfComments() {
        return numbersOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPosts() {
        return averageNumberOfCommentsPerPosts;
    }

    private double calculateAverageNumberOfPostsPerUser() {
        if (numberOfUsers > 0) {
            return (double) numberOfPosts / numberOfUsers;
        }
        return 0;
    }

    private double calculateAverageNumberOfCommentsPerUser() {
        if (numberOfUsers > 0 && numbersOfComments > 0) {
            return (double) numbersOfComments / numberOfUsers;
        }
        return 0;
    }

    private double calculateAverageNumberOfCommentsPerPosts() {
        if (numberOfUsers > 0&& numberOfPosts>0) {
            return (double) numbersOfComments / numberOfPosts;
        }
        return 0;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numbersOfComments = statistics.commentsCount();
        averageNumberOfPostsPerUser = calculateAverageNumberOfPostsPerUser();
        averageNumberOfCommentsPerUser = calculateAverageNumberOfCommentsPerUser();
        averageNumberOfCommentsPerPosts = calculateAverageNumberOfCommentsPerPosts();
    }

    public void showStatistics() {
        System.out.println(numberOfUsers);
        System.out.println(numberOfPosts);
        System.out.println(numbersOfComments);
        System.out.println(averageNumberOfCommentsPerPosts);
        System.out.println(averageNumberOfCommentsPerUser);
        System.out.println(averageNumberOfPostsPerUser);
    }
}

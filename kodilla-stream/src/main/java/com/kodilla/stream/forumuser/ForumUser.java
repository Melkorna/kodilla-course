package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.stream.*;

public final class ForumUser {
    private final int userIdentifier;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final  int numberOfPosts;

    public ForumUser(final int userIdentifier, final String username,final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth,final int numberOfPosts) {

        this.userIdentifier = userIdentifier;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserIdentifier() {
        return userIdentifier;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID = " + userIdentifier +
                ", Name = '" + username + '\'' +
                ", Sex = " + sex +
                ", BirthDay = " + dateOfBirth +
                ", PostCounter = " + numberOfPosts +
                '}';
    }
}

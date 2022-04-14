package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("ala ma kota", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("ala ma kota", text -> text + " ABC"));
        //
        Forum theForum = new Forum();
        LocalDate date = LocalDate.now().minusYears(20);
        Map<Integer, ForumUser> theResulMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isAfter(date))
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserIdentifier, forumUser -> forumUser));


        System.out.println(theResulMapOfUsers);
    }
}
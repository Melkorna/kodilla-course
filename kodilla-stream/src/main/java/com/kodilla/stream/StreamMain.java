package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer,ForumUser> theResulMapOfUsers = theForum.getList().stream()
                .filter(forumUser ->  forumUser.getSex()=='M')
                .filter(forumUser ->  forumUser.getDateOfBirth().getYear()>2001)
                .filter(forumUser ->  forumUser.getNumberOfPosts()>1)
                .collect(Collectors.toMap(ForumUser::getUserIdentifier, ForumUser -> ForumUser));
                theResulMapOfUsers.entrySet().stream()

                        .map(entry -> entry.getKey() + ":" + entry.getValue());
        System.out.println(theResulMapOfUsers);
    }
}
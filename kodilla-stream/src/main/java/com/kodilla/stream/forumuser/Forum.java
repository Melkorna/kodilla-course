package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(524,"Pawel",'M',1993,4,25,6));
        theUsersList.add(new ForumUser(641,"Andrzej",'M',2003,5,6,140));
        theUsersList.add(new ForumUser(524,"Nadia",'W',2006,1,1,66));
        theUsersList.add(new ForumUser(524,"Olka",'W',1990,3,22,32));
        theUsersList.add(new ForumUser(524,"Yaroslaw",'M',1997,11,15,55));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUsersList);
    }
}

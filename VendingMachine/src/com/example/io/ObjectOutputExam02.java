package com.example.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam02 {
    public static void main(String[] args) throws  Exception {
        User user1 = new User("email1@user1.com", "김정일", 1991);
        User user2 = new User("email2@user2.com", "김정이", 1992);
        User user3 = new User("email3@user3.com", "김정삼", 1993);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/userlist.dat"));
        out.writeObject(list);
        out.close();
    }
}

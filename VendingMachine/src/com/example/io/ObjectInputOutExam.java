package com.example.io;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputOutExam {
    public static void main(String[] args) throws Exception{
        User user1 = new User("email1@user1.com", "김정일", 1991);
        User user2 = new User("email2@user2.com", "김정이", 1992);
        User user3 = new User("email3@user3.com", "김정삼", 1993);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
//
////        ArrayList<User> list2 = list; // list 와 list2 는 같은 ArrayList 객체를 참조한다. 복사가 아니다. 연동.
////        ArrayList<User> list2 = new ArrayList<>(); // list 객체는 별도. list 가 참조하는 user 객체는 동일. 얕은복사
//
//        for(int i=0; i<list.size(); i++){
////            System.out.println(list2.get(i));
//            list2.add(list.get(i));
//        }
//
//        list.remove(2);
//        System.out.println(list.size());
//        System.out.println(list2.size());

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(list);
        out.close();
        bout.close();

        byte[] array = bout.toByteArray();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> list2 = (ArrayList) in.readObject();
        in.close();

        list.remove(2);

        for(int i=0; i<list2.size(); i++){
            System.out.println(list2.get(i));
        }
    }
}

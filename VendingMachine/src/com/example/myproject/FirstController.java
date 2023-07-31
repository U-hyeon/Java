package com.example.myproject;

import com.example.framework.Controller;
public class FirstController extends Controller{
    @Override
    protected void run() {
        System.out.println("별도로 동작하는 코드 111111");
    }

    //final 은 오버라이딩 불가
//    @Override
//    protected void init() {
//        super.execute();
//    }
}

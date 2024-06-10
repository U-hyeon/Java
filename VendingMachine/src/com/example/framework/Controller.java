package com.example.framework;

/*
 com.example.framework.Controller 종류가 여러개
 초기화 : 같은 코드
 마무리 : 같은코드
 실행 : 다른코드
*/
public abstract class Controller {
    protected final void init(){ //사용자 직접호출 X
        //초기화
        System.out.println("초기화하는 코드");
    }
    protected abstract void run(); // 사용자 직접호출 X
    protected final void close(){ // 사용자 직접호출 X
        //마무리
        System.out.println("마무리하는 코드");
    }
    public void execute(){
        //초기화
        this.init(); //this: 생략가능
        //실행
        this.run();
        //마무리
        this.close();
    }
}

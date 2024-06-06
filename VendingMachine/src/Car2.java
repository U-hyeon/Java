public abstract class Car2 {
    public Car2 (String name){
        super();
        System.out.println("Car2() 생성자 호출");
    }

    // 추상메소드: 상속받아서 반드시 구현해야함
    public abstract void run();
}

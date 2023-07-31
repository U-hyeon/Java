public class Car2Exam {
    public static void main(String[] args){
        Bus2 b = new Bus2();
        b.run();

        SuperCar s1 = new SuperCar("SuperCar");
        s1.run();

//        Car2 c = ;
//        c.run;
        // 결과 = 알수없다: c는 Car2 일수도, Bus일수도, SuperCar일수도 있다.
        // c가 자손클래스들의 객체라면 정상작동가능

        Car2[] array = new Car2[2]; // 부모클래스의 배열에는 자손클래스를 넣을수 있다. 일반화
        array[0] = new Bus2();
        array[1] = new SuperCar("GenCoup");
        for(Car2 c2 : array){
            c2.run();
        }
    }
}

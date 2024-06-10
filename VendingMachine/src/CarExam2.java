public class CarExam2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1); // println(Object x) -> Object.toString 메소드를 출력
    }
}

// 부모타입의 변수로 자식인스턴스를 참조할 수 있다
// 조상 타입의 변수로 후손인스턴스를 참조할 수 있다.class
// Car c1 = new Bus();
// Car c2 = new 이층버스(); // 이층버스는 Car 의 후손이
// Object c1 = new Car();
// Object c2 = new Bus();
// Object c3 = new 이층버스();
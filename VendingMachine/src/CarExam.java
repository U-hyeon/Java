public class CarExam {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        Car c1 = new Car();
        Car c2 = new Bus();

        b1.run();
        b1.speak();
        c1.run();
        c2.run();

        Bus b2 = (Bus) c2; // c1이 가리키는 인스턴스(Bus)를 (Bus)형태의 b2로 사용하겠다. 동일 인스턴스를 가리킨다.
        b2.run();
        b2.speak();
    }
}

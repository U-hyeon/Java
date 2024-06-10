public class CarExam3 {
    public static void main(String[] args){
        Car c1 = new Car(){
            @Override
            public void run() {
                System.out.println("이름없는 객체의 run() 메소드 오버라이딩");
            }
        };

        c1.run();
    }
}

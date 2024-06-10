import javax.print.attribute.Size2DSyntax;

public class SuperCar extends Car2{
    public SuperCar(String name){
        super(name);
        System.out.println("SuperCar() 생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 주행");
    }
}

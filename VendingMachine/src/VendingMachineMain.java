import java.awt.desktop.SystemSleepEvent;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printVersion();
//        VendingMachine.pushProductButton(100);
        //Non-static method 'pushProductButton(int)' cannot be referenced from a static context

        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

    }
}

// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain

// JVM 은 어디에서 VendingMachineMain을 찾아서 실행할까?

// 답: JVM은 CLASSPATH경로 에서 클래스를 찾을수 있게 된다.
// CLASSPATH에 .(점)이 있을경우 현재경로에서 클래스를 찾을수 있게 된다
// IntelliJ는 소스를 컴파일 하고 out/production/프로젝트 폴더 하래에 class 파일을 생성한다.
// 해당 폴더를 IntelliJ는 CLASSPATH로 인식하게 해준다.
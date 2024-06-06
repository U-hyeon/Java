import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String [] args) throws Exception{
        // a() 메소드를 가지고있는 클래스
        // 클래스 이름을 모른다
        // 이름은 나중에 알려주겠다
        // a()메소드를 실행할수있도록 코드를 작성하라

        String className = "Bus";
        Class clazz = Class.forName(className);
//        Method[] declareMethods = clazz.getDeclaredMethods();
//        for(Method m : declareMethods){
//            System.out.println(m.getName());
//        }
        Object o = clazz.newInstance();
        Bus b = (Bus)o;
        b.speak();

    }
}

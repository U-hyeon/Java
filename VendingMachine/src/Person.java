public class Person {
    // instance field
    String name;
    String address;
    boolean isVip;
    // class field
    static int count = 0;
    static{
        count = 100;
    }

    public void printName() {
        System.out.println("내 이름은" + name);
    }

    public static void printCount() {
        System.out.println("count = " + count);
    }
}

public class PersonTest {
    public static void main(String[] args) {
//        Person p1; //p1 은 null
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "gildong"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다. 되도록 new를 쓰지말자
        p1.address = "일산";
        p2.name = "zozo";
        p2.address = "서울";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length());
        System.out.println(p1.isVip);

        System.out.println("-----------------------------");

        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p1.address.length());
        System.out.println(p2.isVip);
    }
}

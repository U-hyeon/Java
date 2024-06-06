public class PersonTest3 {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.printCount();

//        // non-static 사용불가
//        System.out.println(Person.name);
//        Person.printName();

        Person p1 = new Person();
        p1.name = "홍길동";

//        p1.printName();
//        Person.printCount();
//
//        Person.count++;
//        Person.printCount();
    }
}

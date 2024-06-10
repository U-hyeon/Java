public class Eamx01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("--------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("--------------------");
        Parent p2 = new Child();
        System.out.println(p2.i); // 필드는 type을 따라간다. p2는 parent type 이므로 parent.i
        p2.printI(); // 메소드는 무조건 자식 - child.printI()
        p2.printII(); // parent.i 의 2를 곱한 것
        System.out.println("--------------------");
    }
}

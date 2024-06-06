public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); // MathBean 인스턴스는 Heap 메모리에 올라간다
        math.printClassName();
        math.printNumber(100);
        int x = math.getOne();
        System.out.println(x);
        int val = math.plus(100, 200);
        System.out.println(val);
    }
}

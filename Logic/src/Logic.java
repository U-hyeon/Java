public class Logic {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;

        flag1 = 10 > 5 && 5 < 20; // AND
        flag2 = 10 > 5 & 5 < 20; //AND, flag1 과 결과는 같다. JVM 실행은 다르다
        // &&: 앞이 거짓이면 뒤쪽 연산은 하지않는다. &: 앞이 거짓이어도 뒤쪽 연산을 수행한다.
        // 차이점: i++ 등의 연산이 뒤쪽 식에 포함되어 있다면 &&는 증가하지 않고 &는 증가한다.
        flag3 = 10 >= 10 || 5 > 6; // OR
        flag4 = 10 >= 10 | 5 > 6; // OR, flag3 과 결과는 같다. JVM 실행은 다르다
        flag5 = 10 == 10 ^ 5 == 4; // XOR
        flag6 = !flag5; // NOT

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);
    }
}

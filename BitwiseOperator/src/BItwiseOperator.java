public class BItwiseOperator {
    public static void main(String[] args) {
        // 비트연산
        // &: and, |: or, ^: xor, ~: not, <<: left shift, >>: right shift, >>>: 우측 양수화 시프트
        // &, |, ^: 각 자리의 비트별로 연산한다
        // <<: 빈 자리의 값들은 0으로 채운다.
        // >>: 빈 자리의 값들은 기존의 가장 왼쪽에 있던 비트값으로 채운다.
        // >>>: 빈 자리의 값들은 0으로 채운다. (결과가 무조건 양수가 되도록한다.)

        int x = 0b10000000_00000000_00000000_00000000;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x >> 2));
        System.out.println(Integer.toBinaryString(x >>> 2));

        System.out.println(Integer.toBinaryString(1 << 2));
    }
}

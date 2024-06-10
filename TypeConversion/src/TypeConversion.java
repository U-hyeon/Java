public class TypeConversion {
    public static void main(String[] args) {
        int i1, i2;
//        i1 = 50.0; // 소수점 값이 0이어도 안된다
//        i2 = 25.6f;
        i1 = (int)50.0;
        i2 = (int)25.6f;

        System.out.println(i1);
        System.out.println(i2);

        // 변수타입이 저장 가능한 범위를 벗어나는 값을 저장하면 오버플로우발생 등 정상적으로 수행되지 않는다.
        // int i = Long.MAX_VALUE;
    }
}

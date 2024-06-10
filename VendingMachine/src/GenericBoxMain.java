public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        // genericBox.add(new Integer(5));
        //컴파일불가 : genericBox 라는 객체는 String만 담을수있게 설정되었기 때문
        // 한 객체당 지정한 한가지 객체만 담을수 있다

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5));
        Integer intValue = intBox.get();
        System.out.println(intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.add("hello");
        String str2 = (String) objBox.get(); //형변환 필요
        System.out.println(str2.toUpperCase());
    }
}

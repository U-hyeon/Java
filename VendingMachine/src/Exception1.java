// B라는 사용자가 A라는 사용자가 만든 ExceptionObj1 이용한다
public class Exception1 {
    public static void main(String[] args){
        ExceptionObj1 exobj = new ExceptionObj1();
        try {
            int value = exobj.divide(10, 0); //프로그램은 죽지 않았으나 엉뚱한 값이 나와버렸다
            System.out.println(value);
        }catch (ArithmeticException ex) {
            System.out.println("0으로 나눌수 없어요");
        }
    }
}

// A라는 사용자
class ExceptionObj1{
    public int divide(int i, int k){
        int value = 0;
        value = i / k;
        return value;
    }
}
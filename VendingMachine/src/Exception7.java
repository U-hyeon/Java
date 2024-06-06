public class Exception7 {
    public static void main(String[] args){
        try{
            ExceptionObj7 exobj7 = new ExceptionObj7();
            int value = exobj7.divide(10,0);
            System.out.println(value);
        }catch (MyException ex){
            System.out.println("사용자 정의 Exception이 발생하였다.");
        }
    }
}

class ExceptionObj7{
    public int divide(int i, int k) throws MyException{
        int value = 0;
        try {
            value = i / k;
        }catch (ArithmeticException ex) {
            throw new MyException("0으로 나눌수 없어요");
        }
        return value;
    }
}
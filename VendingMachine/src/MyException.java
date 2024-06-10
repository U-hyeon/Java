public class MyException extends RuntimeException {
    // 오류메시지나 발생한 EXCEPTION을 감싼 결과로 내가만든 Exception을 사용하고 싶을때가 많다

    public MyException(String message){
        super(message);
    }

    public MyException(Exception cause){
        super(cause);
    }
}

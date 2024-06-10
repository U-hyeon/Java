import java.io.IOException;
import java.io.InputStream;

/*
1byte 가 표현가능한값 : 00000000 ~ 11111111
read()메소드가 읽어들일수 있는 정보 : 00000000 ~ 11111111 중의 한개
1byte의 파일읽어들인다. 100byte
1byte씩 읽어들인다. 파일의 크기를 모른다. 그럼 언제까지 읽어들이나?
더이상 읽어들일것이 없다 EOF :
int 에 1byte값을 담자. 00000000 00000000 00000000 00000000
                    00000000 00000000 00000000 11111111
EOF : -1
1 ---> 00000000 00000000 00000000 00000001
1의보수  11111111 11111111 11111111 11111110
2의보수  11111111 11111111 11111111 11111111 : -1

# 왜 byte단위로 읽는 메소드가 byte가 아닌 int 를 리턴하는가? => EOF을 표현하기 위해서
 */

public class InputStreamExam01 {
    public static void main(String[] args){
        InputStream in = null;
        try{
            int data = in.read();
        }catch(IOException ex){
            System.out.println(("io 오류 : " + ex));
        }finally {
            try{
                in.close();
            }catch(Exception ex2){
                System.out.println("io 오류 : " + ex2);
            }
        }
    }
}

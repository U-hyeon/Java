import java.util.Arrays;

public class Array15 {
    public static void main(String[] args){
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3); // [1] 부터 [3] 전까지

        for(char c : copyTo){
            System.out.println(c);
        }
    }
}

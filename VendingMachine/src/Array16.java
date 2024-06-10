import java.util.Arrays;

public class Array16 {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {0,0,0,0,0,6};

        // 양수 0 음수
        // x-y = 값이 : 앞이크면 양수, 뒤가크면 음수, 일치하면 0
        int compare = Arrays.compare(array3, array2);

        System.out.println(compare);
    }
}

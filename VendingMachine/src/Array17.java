import java.util.Arrays;

public class Array17 {
    public static void main(String[] args){
        int[] array = {5,2,3,4,1};

        Arrays.sort(array); //정렬

        for(int i: array){
            System.out.println(i);
        }
    }
}

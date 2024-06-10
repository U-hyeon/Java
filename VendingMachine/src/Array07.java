public class Array07 {
    public static void main(String[] args) {
        double[] array1 = {1.5, 2.4, 3.5};

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
//        System.out.println(array1[3]); //Array Index Out Of Bounds Exception = 범위초과한 참조

        double[] array2 = new double[0];
        System.out.println(array2.length);
//        System.out.println(array2[0]); //Array Index Out Of Bounds Exception = 범위초과한 참조
    }
}

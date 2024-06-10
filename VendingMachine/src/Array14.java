public class Array14 {
    public static void main(String[] args) {
        int[] copyFrom = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);

        // copyTo != copyFrom. 서로 다른 인스턴스를 참조한다. 깊은복사.
        for(int c: copyTo){
            System.out.println(c);
        }

        System.out.println("---------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5); // 남은 공간에는 0

        for(int c: copyTo2){
            System.out.println(c);
        }

        System.out.println("---------------");
        // copyTo3 == copyFrom. copyFrom의 참조주소를 받았기 때문에 둘은 서로 같은 인스턴스를 참조한다. 얕은복사.
        int[] copyTo3 = copyFrom;
        for(int c: copyTo3){
            System.out.println(c);
        }
    }
}

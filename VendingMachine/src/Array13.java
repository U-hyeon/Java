public class Array13 {
    public static void main(String[] args) {
        ItemForArray[] array = new ItemForArray[3];
        array[0] = new ItemForArray(500, "사과");
        array[1] = new ItemForArray(300, "바나나");
        array[2] = new ItemForArray(700, "수박");

        for(ItemForArray i : array) {
            System.out.println(i.getName());
            System.out.println(i.getPrice());
        }
    }
}

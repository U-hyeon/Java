public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.price = 100;
//        System.out.println(b1.price);

        b1.setPrice(500);
        System.out.println(b1.getPrice());
    }
}

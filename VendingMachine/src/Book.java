public class Book {
    private int price;
    private String title;

    //필드의 값을 수정하고 주고받기위한 메소드를 만든다. setter, getter


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

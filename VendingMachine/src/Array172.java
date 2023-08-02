import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String [] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("JS", 6000);
        items[4] = new Item("Dart", 2000);

        //sort( Object[] ) 오브젝트는 모든 객체의 조상클래스라 모든 객체가 가능하다
//        Arrays.sort(items, /*정렬방법을 정의한 객체*/new ItemSorter()); // Item에 대한 정렬기준이 필요하다
//        Arrays.sort(items, (Object o1, Object o2) -> {
//            Item item1 = (Item) o1;
//            Item item2 = (Item) o2;
//            return item1.getName().compareTo(item2.getName());
//        }); // 이름없는객체, 람다 표현식
        Arrays.sort(items, (item1, item2) -> {
            return item1.getName().compareTo(item2.getName());
        }); // 이름없는객체, 람다 표현식 - 타입자동인식

        for(Item item: items){
            System.out.println("Item(name=" + item.getName()+", price=" + item.getPrice()+")");
        }
    }
}

class ItemSorter implements Comparator{
    // o1-o2 앞이크면 양수 o2가크면 음수
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;
        return  item1.getName().compareTo(item2.getName());
    }
}

class Item implements Comparable{
    private String name;
    private int price;

//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name); //
//    } //이름기준으로 비교
    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price;
    } // 가격기준으로 비교

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
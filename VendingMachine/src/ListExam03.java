import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args){
        Collection<String> collection = null; // Collection 을 구현하고 있는 자료구조
//        Collection<String> collection = new HashSet<>(); //list가 아니기에 출력순서를 예상할수 없다.
//        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}

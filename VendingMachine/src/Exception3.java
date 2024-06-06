import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("Exception3.java");
        } catch(FileNotFoundException fnfe){
            System.out.println("file을 찾을수 없다 ");
        }
    }
}

import java.io.*;

public class TempFile {
    public static void main(String[] args){
        try{
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("60초간 멈춰있습니다.");
            try{
                // 1000ms = 1sec
                Thread.sleep(60000); //60sec
            } catch(InterruptedException e1){
                System.out.println(e1);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}

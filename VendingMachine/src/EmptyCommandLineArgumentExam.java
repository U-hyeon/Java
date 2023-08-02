public class EmptyCommandLineArgumentExam {
    public static void main(String [] args){
        System.out.println(args.length);
    }
}

// String[] args = new String[0];
// main(args);

// javac EmptyCommandLineArgumentExam.java
// java EmptyCommandLineArgumentExam a b c d hello => args.length = 5
// java -javaagen:어떤설정 EmptyCommandLineArgumentExam a b c
// java (java에게 주는 옵션) (클래스명) (프로그램 arguments)
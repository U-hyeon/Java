public class UnlimitedArgumentExam {
    public static void main(String [] args){
        System.out.println(sum());
        System.out.println(sum(1,2,3,5));
        System.out.println(sum(2,5,7,5,2,1,2));
    }

    public static int sum(int... args){
        System.out.println("print1 메소드 - args길이 : " + args.length);
        int sum =0;
        for (int i=0; i< args.length; i++){
            sum += args[i];
        }
        return sum;
    }
}

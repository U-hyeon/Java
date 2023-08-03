public class DaySwitchTest {
    public static void main(String[] args){
        Day day = Day.SUNDAY;

        switch (day){
//            case Day.SUNDAY: //컴파일에러
            case SUNDAY: //enum이 가지고있는 상수이름만 쓸것
                System.out.println("일요일");
                break;
            case MONDAY:
                System.out.println("월요일");
                break;
            default:
                System.out.println("그 밖의 요일");
        }
    }
}

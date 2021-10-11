package test.programmers.level1;

import java.util.Calendar;

public class Test16_2016년_REre {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        Calendar cd = Calendar.getInstance();
        cd.set(2016,a,b);
        int weekOfYear = cd.get(Calendar.WEEK_OF_YEAR);
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };


        System.out.println("weekOfYear = " + day[weekOfYear]);
    }
}

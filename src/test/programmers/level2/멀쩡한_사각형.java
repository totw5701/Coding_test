package test.programmers.level2;

public class 멀쩡한_사각형 {

    public static long square(int w, int h){
        double hd = (double) h;
        double wd = (double) w;

        if (wd == hd) {
            return (long)(wd*hd-w);
        }

        long count = 0;
        for (int i = 0; i < w; i++) {
            count += (int) (hd *i / wd);
        }
        return count*2;
    }


    public static void main(String[] args) {
        int w = 5;
        int h = 5;
        long square = square(w, h);
        System.out.println("square = " + square);
    }
}

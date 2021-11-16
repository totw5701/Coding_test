package test.programmers.level2;

public class 카펫 {

    public static int[] basic(int brown, int yellow) {

        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i != 0) {
                continue;
            }

            int row = yellow / i;
            int col = i;

            int bro = row * 2 + i * 2 + 4;


            System.out.println("bro = " + bro);
            System.out.println("row = " + row);
            System.out.println("col = " + col);
            System.out.println("brown = " + brown);
            if (bro == brown) {
                return new int[]{row+2, col+2};
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int yellow = 2;
        int brown = 10;

        int[] basic = basic(brown, yellow);
        System.out.println("basic = " + basic);
    }
}

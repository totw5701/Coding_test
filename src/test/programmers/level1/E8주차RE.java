package test.programmers.level1;

import java.util.Arrays;

public class E8주차RE {
    public static void main(String[] args) {

        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};

        int ver = 0;
        int hor = 0;

        for(int[] card : sizes){
            Arrays.sort(card);
            if(card[0] <= ver && card[1] <= hor) continue;
            ver = Math.max(ver, card[0]);
            hor = Math.max(hor, card[1]);

        }
        System.out.println("ver = " + ver);
        System.out.println("hor = " + hor);

    }

}

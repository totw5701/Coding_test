package test.programmers.level1;

public class E8주차 {
    public static void main(String[] args) {

        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};

        int hor = 0;
        int ver = 0;

        for(int[] card : sizes){
            if(canPutIn(card, ver, hor)) continue;

            // 그냥 넣기
            //ver = Math.max(ver, card[0]);
            int tempVer = ver;
            int tempHor = hor;
            tempVer = Math.max(tempVer, card[0]);
            tempHor = Math.max(tempHor, card[1]);
            int tempArea = tempVer*tempHor;

            //세로 넣기
            tempVer=ver;
            tempHor=hor;
            tempVer = Math.max(tempVer, card[1]);
            tempHor = Math.max(tempHor, card[0]);
            int tempArea2 = tempVer*tempHor;

            if(tempArea <= tempArea2){
                ver = Math.max(ver, card[0]);
                hor = Math.max(hor, card[1]);
            }else{
                ver = Math.max(ver, card[1]);
                hor = Math.max(hor, card[0]);
            }

        }
        System.out.println("ver = " + ver);
        System.out.println("hor = " + hor);


    }

    public static boolean canPutIn(int[] card, int ver, int hor){
        if(card[0] <= ver && card[1] <= hor){
            return true;
        }
        if(card[1] <= ver && card[0] <= hor){
            return true;
        }
        return false;
    }
}

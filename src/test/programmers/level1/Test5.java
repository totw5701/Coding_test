package test.programmers.level1;

public class Test5 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};

        int count = 0;
        boolean isDecimal = true;

        for(int x = 0;x<nums.length;x++){
            for(int y = x+1;y<nums.length;y++){
                for(int z = y+1;z<nums.length;z++){
                    int triSum = nums[x] + nums[y] + nums[z];
                    isDecimal = true;
                    for(int k = 2 ; k <= Math.sqrt(triSum) ; k++){
                        if(triSum % k == 0){
                            isDecimal = false;
                            break;
                        }
                    }
                    if(isDecimal){
                        count++;
                    }

                }
            }
        }




    }
}

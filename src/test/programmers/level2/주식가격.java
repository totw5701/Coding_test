package test.programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class 주식가격 {

    public static int[] basic(int[] prices){

        //Stack<Integer> stk = new Stack<>();
        Stack<int[]> stk = new Stack<>();

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices[i] = " + prices[i]);
            int[] temp = {i, prices[i]};
            if (stk.empty()) {
                stk.push(temp);
                continue;
            }

            while (prices[i] < stk.peek()[1]) {
                // index(초) - 감소 시간 i
                int[] pop = stk.pop();
                answer[pop[0]] = i - pop[0];
                System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
                if (stk.empty()) {
                    break;
                }
            }

            stk.push(temp);

        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = answer.length - i - 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] prices = {5, 8, 6, 2, 4, 1};
        int[] basic = basic(prices);
        System.out.println("basic = " + Arrays.toString(basic));
    }
}

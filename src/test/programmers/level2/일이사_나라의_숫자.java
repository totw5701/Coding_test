package test.programmers.level2;

import java.util.Map;
import java.util.Stack;

public class 일이사_나라의_숫자 {

    public static String oddCountryNum(int n){

        Stack<Integer> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        while(n > 3){
            if(n % 3 == 1){
                st.push(1);
                n /= 3;
            }else if(n % 3 == 2){
                st.push(2);
                n /= 3;
            }else if(n % 3 == 0){
                st.push(4);
                n = n / 3 - 1;
            }
        }
        if(n == 1){
            st.push(1);
        }else if (n == 2){
            st.push(2);
        }else{
            st.push(4);
        }

        while(!st.empty()){
            str.append(st.pop());
        }


        return str.toString();
    }

    public static void main(String[] args) {
        int n = 12;
        String s = oddCountryNum(n);
        System.out.println("s = " + s);
    }
}

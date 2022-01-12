package test.programmers.level2;

import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;

public class 수식_최대화 {

    public static long solution(String expression) throws ScriptException {

        List<String> split = parser(expression);

        return comparison(split);
    }

    public static Long calculator(Character[] sym, List<String> split) throws ScriptException {


        List<String> temp = new ArrayList<>();
        for (String s : split) {
            temp.add(s);
        }

        for (Character c : sym) {
            for (int i = 1; i < temp.size(); i++) {

                if(temp.get(i).equals(c.toString())){

                    long cal = 0;

                    if(c == '*') cal = Long.parseLong(temp.get(i - 1)) * Long.parseLong(temp.get(i + 1));
                    else if(c == '+') cal = Long.parseLong(temp.get(i - 1)) + Long.parseLong(temp.get(i + 1));
                    else if(c == '-') cal = Long.parseLong(temp.get(i - 1)) - Long.parseLong(temp.get(i + 1));

                    temp.set(i-1, String.valueOf(cal));
                    temp.remove(i);
                    temp.remove(i);
                    i--;
                }
            }
        }

        long l = Long.parseLong(temp.get(0));
        return Math.abs(l);
    }


    public static Long comparison(List<String> split) throws ScriptException {

        long max = 0;

        Character[][] syms = {{'*', '+', '-'},
                {'*', '-', '+'},
                {'+', '*', '-'},
                {'+', '-', '*'},
                {'-', '+', '*'},
                {'-', '*', '+'}};

        for (Character[] sym : syms) {
            Long result = calculator(sym, split);
            if(max < result) max = result;
        }

        return max;
    }

    public static List<String> parser(String expression) {

        String[] numbers = expression.split("[*+-]");
        String[] symbols = expression.replaceAll("[0-9]", "").split("");

        List<String> result = new ArrayList<>();

        result.add(numbers[0]);
        for (int i = 0; i < symbols.length; i++) {
            result.add(symbols[i]);
            result.add(numbers[i+1]);
        }

        return result;
    }


    public static void main(String[] args) throws ScriptException {

        String expression = "100-200*300-500+20";
        solution(expression);
    }
}

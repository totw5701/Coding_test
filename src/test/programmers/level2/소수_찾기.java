package test.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {

    public static int prime(String numbers) {
        String[] split = numbers.split("");
        Set<Integer> set = new HashSet<>();

        // 1개 씩
        for (int i = 0; i < split.length; i++) {
            String num = split[i];
            set.add(Integer.parseInt(num));
        }

        // 2개 씩
        for (int j = 0; j < split.length; j++) {
            for (int i = 0; i < split.length; i++) {
                if(i == j)continue;
                String num = split[j] + split[i];
                set.add(Integer.parseInt(num));
            }
        }

        // 3개 씩
        for (int z = 0; z < split.length; z++) {
            for (int j = 0; j < split.length; j++) {
                for (int i = 0; i < split.length; i++) {
                    if(i == j || i == z || z == j)continue;
                    String num = split[z] + split[j] + split[i];
                    set.add(Integer.parseInt(num));
                }
            }
        }

        // 4개 씩
        for (int k = 0; k < split.length; k++) {
            for (int z = 0; z < split.length; z++) {
                for (int j = 0; j < split.length; j++) {
                    for (int i = 0; i < split.length; i++) {
                        if(i == j ||
                                i == z || z == j ||
                                k == i || k == j || k == z)continue;
                        String num = split[k] + split[z] + split[j] + split[i];
                        set.add(Integer.parseInt(num));
                    }
                }
            }
        }

        // 5개 씩
        for (int n = 0; n < split.length; n++) {
            for (int k = 0; k < split.length; k++) {
                for (int z = 0; z < split.length; z++) {
                    for (int j = 0; j < split.length; j++) {
                        for (int i = 0; i < split.length; i++) {
                            if(i == j ||
                                    i == z || z == j ||
                                    k == i || k == j || k == z ||
                                    n == i || n == j || n == k || n == z)continue;
                            String num = split[n] + split[k] + split[z] + split[j] + split[i];
                            set.add(Integer.parseInt(num));
                        }
                    }
                }
            }
        }

        // 6개 씩
        for (int m = 0; m < split.length; m++) {
            for (int n = 0; n < split.length; n++) {
                for (int k = 0; k < split.length; k++) {
                    for (int z = 0; z < split.length; z++) {
                        for (int j = 0; j < split.length; j++) {
                            for (int i = 0; i < split.length; i++) {
                                if(i == j ||
                                        i == z || z == j ||
                                        k == i || k == j || k == z ||
                                        n == i || n == j || n == k || n == z ||
                                        m == i || m == j || m == k || m == z || m == n)continue;
                                String num = split[m] + split[n] + split[k] + split[z] + split[j] + split[i];
                                set.add(Integer.parseInt(num));
                            }
                        }
                    }
                }
            }
        }

        // 7개 씩
        for (int q = 0; q < split.length; q++) {
            for (int m = 0; m < split.length; m++) {
                for (int n = 0; n < split.length; n++) {
                    for (int k = 0; k < split.length; k++) {
                        for (int z = 0; z < split.length; z++) {
                            for (int j = 0; j < split.length; j++) {
                                for (int i = 0; i < split.length; i++) {
                                    if(i == j ||
                                            i == z || z == j ||
                                            k == i || k == j || k == z ||
                                            n == i || n == j || n == k || n == z ||
                                            m == i || m == j || m == k || m == z || m == n ||
                                            q == i || q == j || q == k || q == z || q == m || q == n)continue;
                                    String num = split[q] + split[m] + split[n] + split[k] + split[z] + split[j] + split[i];
                                    set.add(Integer.parseInt(num));
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("set = " + set);

        int count = set.size();
        for (Integer num : set) {
            if (num == 0 || num == 1) {
                System.out.println("num = " + num);
                count--;
                continue;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println("num = " + num);
                    count--;
                    break;
                }
            }

        }

        return count;
    }


    public static int primeV2(String numbers){
        String[] split = numbers.split("");
        Set<Integer> set = new HashSet<>();

        search(split, set);

        return 1;
    }

    public static void search(String[] split, Set<Integer> set){
        for (int i = 0; i < split.length; i++) {

            search(split, set);

            String num = split[i];
            set.add(Integer.parseInt(num));
        }
    }



    public static void main(String[] args) {
        String numbers = "011";
        int prime = primeV2(numbers);
        System.out.println("prime = " + prime);
    }
}

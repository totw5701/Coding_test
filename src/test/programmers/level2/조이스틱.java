package test.programmers.level2;

public class 조이스틱 {

    public static int solution(String name) {

        char[] arr = name.toCharArray();
        int idx = 0;

        int count = 0;

        while (true) {

            int i = lefOrRig(idx, arr);
            System.out.println("i = " + i);
            if(Math.abs(i) == arr.length) break;

            count += i;
            idx += i;

            if (idx >= arr.length) {
                idx = idx % arr.length;
            } else if (idx < 0) {
                idx = arr.length + idx;
            }

            char c = arr[idx];
            System.out.println("upDown(c) = " + upDown(c));
            count += upDown(c);
            System.out.println("count = " + count);
            arr[i % arr.length] = 'A';
        }

        return count;
    }

    public static int upDown(char c) {
        System.out.println("Up and Down");

        if (c == 'M') {
            System.out.println(" 13 ");
            return 13;
        } else if (c > 'M') {
            System.out.println( "c > M");
            return 'Z' + 1 - c;
        } else {
            System.out.println("c < M");
            System.out.println('E' - 'A');
            System.out.println("c = " + c);
            return c - 'A';
        }
    }

    public static int lefOrRig(int idx, char[] arr) {
        System.out.println("Left or Right");

        int r = 0;
        int l = 0;

        // 오른쪽 거리
        for (int i = idx + 1; i % arr.length != idx; i++) {
            r++;

            char c = arr[i % arr.length];

            if (c != 'A') {
                break;
            }
        }


        // 왼쪽 거리
        boolean isOver = false;
        for (int i = idx; i >= 0; i--) {
            l++;
            char c = arr[i];

            if (c != 'A') {
                isOver = true;
                break;
            }
        }

        if (!isOver) {
            for (int i = arr.length - 1; i > idx; i--) {
                l++;
                char c = arr[i];

                if (c != 'A') {
                    break;
                }
            }
        }


//        for (int i = idx - 1; i % arr.length != idx; i--) {
//            l--;
//
//            if (i < 0) {
//
//            }
//
//            char c = arr[i % arr.length];
//
//            if (c != 'A') {
//                break;
//            }
//        }

        System.out.println("l = " + l);
        System.out.println("r = " + r);

        if (r == l) {
            return r;
        } else if (r > l) {
            return r;
        } else {
            return -1 * l;
        }
    }

    public static void main(String[] args) {

        int count = solution("JEROEN");
        System.out.println("count = " + count);
    }
}

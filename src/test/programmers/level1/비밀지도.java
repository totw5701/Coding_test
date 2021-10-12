package test.programmers.level1;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        StringBuilder[] resultMap = new StringBuilder[n];

        for(int i = 0; i < n; i++){
            resultMap[i] = new StringBuilder();
            String map1 = toBinary(arr1[i], n);
            String map2 = toBinary(arr2[i], n);
            System.out.println("map1 = " + map1);
            System.out.println("map2 = " + map2);
            for(int j = 0; j < n; j++){
                if(map1.charAt(j) == '0' && map2.charAt(j) == '0'){
                    resultMap[i].append(" ");
                }else {
                    resultMap[i].append("#");
                }
            }
            System.out.println("resultMap = " + resultMap[i]);
        }

    }

    public static String toBinary(int num, int length){
        StringBuilder binary = new StringBuilder();
        for(int i = 0; i < length; i++){
            binary.append(num%2);
            num = num/2;
        }
        String string = binary.reverse().toString();
        return string;
    }

}

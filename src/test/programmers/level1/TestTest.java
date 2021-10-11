package test.programmers.level1;

public class TestTest {
    public static void main(String[] args) {
//
//
//        // 1. 소문자 치환
//        String phase1 = new_id.toLowerCase();
//
//        // 2.  특수문자 제거
//        String phase2 = "";
//        for(int i = 0; i < phase1.length();i++) {
//            if(String.valueOf(phase1.charAt(i)).matches("[a-z0-9._-]")) {
//                phase2+=phase1.charAt(i);
//            }
//        }
//
//        // 2 번째 방법.
//        System.out.println("2. 2번째 방법, " + phase1);
//        String sssss = phase1.replaceAll("[^a-z0-9._-]", "");
//        System.out.println("2. 2번째 방법, " + sssss);
//
//        System.out.println("phase2 "+phase2);
//
//        // 3. 연속된 마침표 제거.
//        System.out.println("3. 마침표 제거");
////        String phase3 = "";
////        for(int i = 0; i < phase2.length();i++) {
////
////        	if(phase2.charAt(i) == '.') {
////        		if(i == phase2.length()) {
////        			phase3 += phase2.charAt(i);
////        		}else if(phase2.charAt(i+1) != '.') {
////        			phase3 += phase2.charAt(i);
////        		}
////        	}else {
////        		phase3 += phase2.charAt(i);
////        	}
////
////		}
//
//        while(phase2.indexOf("..") != -1) {
//            phase2 = phase2.replace("..", ".");
//        }
//
//        String phase3 = phase2;
//
//        System.out.println("phase3 "+phase3);
//
//        System.out.println("4번째 시작");
//
//        String phase4 = "";
//        if(phase3.charAt(0) == '.'){
//            phase4 = phase3.substring(1, phase3.length() - 1);
//        }
//        if(phase3.charAt(phase3.length()-1) == '.'){
//            phase4 = phase3.substring(0, phase3.length()-2);
//        }
//
//        phase4.isEmpty();
//
//        System.out.println("길이조절");
//
//        String phase6 = phase4;
//
//        System.out.println("phase6 = " + phase6);
//        if(phase6.length() >= 16){
//            phase6 = phase6.substring(0,15);
//        }
//        if(phase6.charAt(phase6.length()-1) == '.'){
//            phase6 = phase6.substring(0, phase6.length()-2);
//        }
//        System.out.println("phase6 = " + phase6);
//
//        System.out.println("7단계");
//        String phase7 = phase6;
//
//        while(phase7.length() <= 2){
//            phase7 += phase7.charAt(phase7.length()-1);
//        }


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

        String new_id = "=.=";

        // 1. 소문자 치환
        String phase1 = new_id.toLowerCase();
        System.out.println("phase1 = " + phase1);

        // 2.  특수문자 제거
        String phase2 = phase1.replaceAll("[^a-z0-9._-]", "");
        System.out.println("phase2 = " + phase2);

        // 3. 연속된 마침표 제거.
        String phase3 = "";
        while(phase2.indexOf("..") != -1) {
            phase2 = phase2.replace("..", ".");
        }
        phase3 = phase2;
        System.out.println("phase3 = " + phase3);

        // 4. 처음, 끝 마침표 제거.
        String phase4 = phase3;
        if(phase4.charAt(0) == '.'){
            phase4 = phase4.substring(1, phase4.length());
        }
        if(!phase4.isEmpty()) {
            if (phase4.charAt(phase4.length() - 1) == '.') {
                phase4 = phase4.substring(0, phase4.length() - 1);
            }
        }
        System.out.println("phase4 = " + phase4);

        // 5. 빈문자열이면 a 대입
        String phase5 = "";
        if(phase4.isEmpty()){
            phase5 = "a";
        }else{
            phase5 = phase4;
        }
        System.out.println("phase5 = " + phase5);

        // 6. 문자열 길이 조절.
        String phase6 = phase5;
        if(phase6.length() >= 16){
            phase6 = phase6.substring(0,15);
        }
        if(phase6.charAt(phase6.length()-1) == '.'){
            phase6 = phase6.substring(0, phase6.length()-1);
        }
        System.out.println("phase6 = " + phase6);

        // 7. 문자열 길이 조절.
        String phase7 = phase6;
        while(phase7.length() <= 2){
            phase7 += phase7.charAt(phase7.length()-1);
        }
        System.out.println("phase7 = " + phase7);



    }
}

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 케이스 개수

        for(int test_case = 1; test_case <= T; test_case++) {
            String sentence = sc.next();
            String answer = "";

            String[] array = new String[sentence.length()/4];

            for(int i=0 ;i<sentence.length()/4; i++) { // 4글자씩 담기
                int j = i*4;
                array[i] = sentence.substring(j, j+4);
            }

            for(String word : array) {
                char[] arrayChar = word.toCharArray(); // 하나 4글자를 각각 쪼갬
                String number = "";

                for(int cycletime = 0; cycletime<4; cycletime++) { //26자리로 디코딩
                    char temp = arrayChar[cycletime];
                    int intTemp;
                    if(temp == '+') {
                        intTemp = 62;
                    } else if(temp == '/') {
                        intTemp = 63;
                    } else if((int)temp < 58) { //숫자일때
                        intTemp = (int)temp + 4;
                    } else if((int)temp < 91) { // 대문자일때
                        intTemp = (int)temp - 65;
                    } else { // 소문자일때
                        intTemp = (int)temp - 71;
                    }
                    String stringtemp = String.format("%06d", Integer.parseInt(Integer.toBinaryString(intTemp)));
                    number = number + stringtemp; // 26자리 모아논거
                }

                for(int cycletime1 = 0; cycletime1<3; cycletime1++) { // answer 만들기
                    int intTemp1 = cycletime1*8;
                    String temp1;
                    if(cycletime1 == 2) {
                        temp1 = number.substring(intTemp1);
                    }else {
                        temp1 = number.substring(intTemp1,intTemp1+8);
                    }
                    int decnumber = Integer.parseInt(temp1, 2); // 2진수를 10진수로
                    answer += (char)decnumber;
                }
            }

            System.out.println("#" + test_case + " " + answer);

        }
    }
}

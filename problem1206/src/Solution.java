import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = 10;

        for(int test_case = 1; test_case <= T; test_case++) {

            int case_size = sc.nextInt();
            int[] array = new int[case_size];

            for(int i=0; i<case_size; i++) {
                array[i] = sc.nextInt();
            }

            int result = 0;

            for (int index =2; index < case_size-2; index++){
                int near_max_height = array[index-2];
                for(int j=index-1; j<index+3; j++) { //주변 건물중 가장 큰 건물 크기 찾기
                    if(j==index) {

                    } else if(near_max_height < array[j]) near_max_height = array[j];
                }

                if(array[index] <= near_max_height) {

                } else {
                    result += (array[index] - near_max_height);
                }

            }
            System.out.println("#" + test_case + " " + result);


        }
    }
}

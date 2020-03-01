import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case<=T; test_case++) {
            int size = sc.nextInt();
            int[] array = new int[size];

            for(int i=0; i<size; i++) { //배열에 값 저장하기
                array[i] = sc.nextInt();
//                System.out.println(array[i]);
            }

            int max = array[size-1];
            long total = 0;
            for(int j=size; j>0; j--) {
                if(max<array[j-1]) {
                    max = array[j-1];
                } else {
                    total += max-array[j-1];
                }
            }
            System.out.println("#" + (test_case) + " " + total);
//            System.out.println(total);
        }
    }
}

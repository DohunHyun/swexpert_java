import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        int T;


        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int test_case = 1; test_case<T; test_case++) {
            int casenumber = sc.nextInt();
            int max = 0;
            int[] score = new int[101];

            for(int j=0; j<1000; j++) {
                int temp = sc.nextInt();
                score[temp]++;
            }

            for(int k=0; k<score.length; k++) {
                if(score[k] >= score[max]) max = k;
            }

            System.out.println("#" + casenumber + " " + max);

        }
    }
}

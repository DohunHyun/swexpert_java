import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case<=T; test_case++) {
            String input = sc.nextLine();
            String[] array = input.split(" ");

            int P = Integer.valueOf(array[0]);
            int Q = Integer.valueOf(array[1]);
            int R = Integer.valueOf(array[2]);
            int S = Integer.valueOf(array[3]);
            int W = Integer.valueOf(array[4]);

            int result = 0;

            int A = P * W;
            int B;

            if(R>=W) B = Q;
            else B = (W-R)*S + Q;

            if(A>B) result = B;
            else result = A;

            System.out.println("#"+test_case + " " + result);

        }
    }
}

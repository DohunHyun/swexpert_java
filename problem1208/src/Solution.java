import java.util.Scanner;

public class Solution {
    static int[] arrayInt;

    public static void main(String[] args) {
        int result=0;

        Scanner sc = new Scanner(System.in);

        int T = 10;

        for(int test_case=1; test_case<=T; test_case++) {
            int count = sc.nextInt();
            sc.nextLine();
            String sentence = sc.nextLine();
            String[] arrayString = sentence.split(" ");

            arrayInt = new int[arrayString.length];

            for(int i=0; i<arrayString.length; i++) { //Int형으로 변환
                arrayInt[i] = Integer.valueOf(arrayString[i]);
            }

            for(int j=0; j<count; j++) { // 주어진 count 수만큼 반복 작업
                move(findMaxIndex(), findMinIndex());
            }

            result = findMax() - findMin();

            System.out.println("#" + test_case + " " + result);
        }


    }



    private static void move(int max, int min) { // max 값에서 min 값으로 1개 이동하는 메소드
        arrayInt[max]--;
        arrayInt[min]++;
    }

    private static int findMinIndex() {
        int minIndex = 0;
        for(int i=0; i<arrayInt.length; i++) {
            if(arrayInt[i] < arrayInt[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    private static int findMaxIndex() {
        int maxIndex = 0;
        for(int i=0; i<arrayInt.length; i++) {
            if(arrayInt[i] > arrayInt[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    private static int findMin() { // arrayInt[] 에서 최솟값을 찾아야함.
        int minValue = arrayInt[0];
        for(int i=0; i<arrayInt.length; i++) {
            if(arrayInt[i] < minValue) minValue = arrayInt[i];
        }
        return minValue;
    }

    private static int findMax() {
        int maxValue = arrayInt[0];
        for(int i=0; i<arrayInt.length; i++) {
            if(arrayInt[i] > maxValue) maxValue = arrayInt[i];
        }
        return maxValue;
    }
}

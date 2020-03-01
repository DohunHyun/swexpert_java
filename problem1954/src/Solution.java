import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;  //테스트케이스 개수

        T = sc.nextInt();

        for(int test_case = 1; test_case <=T; test_case++) {
            int N = sc.nextInt();   //크기
            int[][] array = new int[N][N];  //2차원 배열을 만든다
            int temp=1;
            int x=0; int y=0;
            int direction = 0;

            for(int i=0; i<N*N; i++) { //배열 채우기
                array[x][y] = temp++;

                if(direction==0) { //열(y) 증가 ->
                    y++;
                }else if(direction==1) { //행(x) 증가 v
                    x++;
                }else if(direction==2) { //열(y) 감소 <-
                    y--;
                }else { //행(x) 감소 ^
                    x--;
                }

                if(x>=N) { //밑으로 쭉 간 경우 왼쪽으로 회전
                    if(direction==3) direction=0;
                    else direction++;
                    x--;
                    y--;
                } else if(y>=N) { //오른쪽으로 쭉 간 경우 아래로 회전
                    if(direction==3) direction=0;
                    else direction++;
                    y--;
                    x++;
                } else if(y<0){ // 왼쪽으로 쭉 간경우 위쪽으로 회전
                    direction = 3;
                    y++;
                    x--;
                } else if(array[x][y]!=0) {

                    if(direction==0) {
                        y--;
                        x++;
                    }
                    else if(direction==1) {
                        x--;
                        y--;
                    }
                    else if(direction==2){
                        y++;
                        x--;
                    }
                    else {
                        x++;
                        y++;
                    }

                    if(direction==3) direction=0;
                    else direction++;

                }
            }

            System.out.println("#" + test_case);
            for(int j=0; j<N; j++) {
                for(int k=0; k<N; k++) {
                    System.out.print(array[j][k]+ " ");
                }
                System.out.println();
            }
        }
    }
}

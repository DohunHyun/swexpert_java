import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int student = 1000;

        for(int test_case = 1; test_case<=T; test_case++) {
            int testnumber = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            // integer 값을 key, value 값으로 받는 HashMap을 만든다.

            for(int cycle=1; cycle<=student; cycle++) {
                int temp = sc.nextInt();
                int value = 0;
                if(map.containsKey(temp)) { //temp값을 key값으로 하는 객체가 있는지 확인
                    map.put(temp, map.get(temp)+1); //만약 이미 있다면 value값을 1 올려준다.
                } else {
                    map.put(temp, value); //만약 없다면 새롭게 만들어준다.
                }
            }

            int maxValueInMap = Collections.max(map.values());
            // 맵 안에 있는 value 값중에 최대값을 찾는다. 즉 최빈수를 찾는다.
            // Collections 에 있는 max 메소드를 활용해서 map에 value 중에 최대값을 찾아낸다.

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                //entrySet()을 활용해서 map에 entry 전체를 확인하면서 반복
                if(entry.getValue() == maxValueInMap) { //최대값과같은 value를 갖는 entry를 찾고
                    System.out.println("#" + testnumber + " " + entry.getKey());
                    //그 엔트리의 키를 출력한다.
                }
            }



        }
    }
}

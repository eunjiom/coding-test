import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 긴 변 찾는 정렬(오름차순)
        Arrays.sort(sides);

        // 가장 긴 변(sides[2])이 나머지 두 변의 합보다 작으면 삼각형(1 리턴)
        int answer = (sides[2] < sides[0] + sides[1]) ? 1 : 2;

        return answer;
    }
}
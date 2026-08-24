import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // n-1 ~ 길이 끝
        int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}
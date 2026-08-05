import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 배열을 오름차순으로 정렬 (작은 값 -> 큰 값)
        Arrays.sort(numbers);
        // 끝과 끝-1 곱하기
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
// 입력: 정수x, 자연수 n
// x*i i++ 길이n


class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 1; i <= n; i++){
            answer[i-1] = (long)x*i;
        }
        return answer;
    }
}
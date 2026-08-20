class Solution {
    public int[] solution(int n) {
        
        // 약수가 몇 개인지 세기
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        // 개수만큼 배열 만들고 다시 돌면서 나누어 떨어지는 약수 채우기
        int[] answer = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[idx] = i;
                idx++;
            }
        }
        
        return answer;
    }
}
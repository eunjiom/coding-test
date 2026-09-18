// 입력: n, numlist
// 로직: numlist를 돌면서 n으로 나눠떨어지는 수만 골라내기
// 출력: n의 배수만 담긴 새 배열

class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        
        // n의 배수가 몇 개인지 개수 세기
        for (int num : numlist) {
            if (num % n == 0) { // 0이면 n의 배수
                count++;
            }
        }
        
        // 크기만큼 배열 생성
        int[] answer = new int[count];
        int idx = 0; // answer에 값 채울 위치
        
        // n의 배수만 answer에 저장
        for (int num : numlist) {
            if (num % n == 0) { // 0이면 n의 배수
                answer[idx] = num;
                idx++;
            }
        }
        
        return answer;
    }
}
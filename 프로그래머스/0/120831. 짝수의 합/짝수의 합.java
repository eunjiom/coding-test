// 입력: 정수 n

// 로직: 합의 끝이 0을 포함한 짝수
// 1번: 각 숫자가 짝수인지 확인

// 2번: for (int i = 2; i<= n; i+=2){
//            answer += i;
//        }

// 3번: for ( int i = 0 ; i<= n; i++){
//   if ( i%2==0){
//            answer+= i;
// }}}

// 출력: 정수 n 이하의 짝수를 모두 더한 값


class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i<= n; i+=2){
            answer += i;
        }
        return answer;
    }
}
// 입력: n
// 출력: n/x = 1

// 로직 x++ x < n , n/x == 1?

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int x = 2; x < n; x++){
            if(n%x == 1){
                answer = x;
                break;
            }
        }
        return answer;
    }
}
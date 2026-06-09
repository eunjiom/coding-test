// 7 이하일 때 1 14이하 일때 2 21 이하일 때 3

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(answer * 7 < n){
            answer+=1;
        }
        return answer;
    }
}
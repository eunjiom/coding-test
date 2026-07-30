class Solution {
    public int solution(int n, int k) {
    int 총금액 = n*12000 + k*2000;
    int 서비스 = n/10;
    int answer = 총금액 - 서비스*2000 ;
    return answer;
    }
}

// 나머지 구해서 홀수 , 짝수 사이즈 구하기 / 0자리부터 채우기 = n 전까지

class Solution {
    public int[] solution(int n) {
        int size = (n%2 == 1) ? n/2+1 : n/2;
        int[] answer = new int[size];
        int x = 0;
        for(int i = 1; i <= n; i += 2){
            answer[x] = i;
            x++;
    }
        return answer;
}
}
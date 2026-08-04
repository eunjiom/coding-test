class Solution {
    // 모두 양수면 1, 모두 음수면 3, x만 음수면 2, y만 음수면 4
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        }
        else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        }
        else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        }
        else{answer = 4;}
        return answer;
    }
}
// 입력: num

// 로직: num%2 == 0 -> 짝수 1 -> 홀수

// 출력: Odd, Even

class Solution {
    public String solution(int num) {
        String answer = "";
        if (num%2 == 0){
            answer = "Even";
        }
        else {
            answer = "Odd";
        }
        return answer;
    }
}
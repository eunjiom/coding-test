// 입력: arr

// 로직: arr[0]..arr[arr.length-1]

// 출력: arr 평균값 

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i < arr.length; i++){
            answer += arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }
}
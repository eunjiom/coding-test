// 입력: numbers

// 로직: 넘버스 다 더하고, 길이로 나누기 -> 더블값
// sum = 넘버스의 합 
// numbers[0],numbers[1]...numbers.legth

// 1번: for ( i = 0; i< numbers.length; i++){
//    sum += numbers[i];
// }

// 2번: for (int num  : numbers){
//    sum += num;
// } : numbers 하나씩 꺼내서 더해줌(리스트)

// 출력: numbers의 평균값(double)

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;
    }
}
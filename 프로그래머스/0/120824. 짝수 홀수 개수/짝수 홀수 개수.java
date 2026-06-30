// num_list 원소에 +1 씩 넣어서 짝수면 홀수, 홀수면 짝수로 구분하면 안 되나..ㅎ
// 클로드: 원소의 나머지를 구해 짝수[0], 홀수[0]에 추가

class Solution {
    public int[] solution(int[] num_list) {
        int 짝수 = 0;
        int 홀수 = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
               짝수++;
            } else {
                홀수++;
            }
        }
        int[] answer = new int [2];
        answer[0] = 짝수;
        answer[1] = 홀수;
        return answer;
    }
}
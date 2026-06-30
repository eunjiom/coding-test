// num_list를 string으로 바꾼 뒤집고 숫자로 바꾸면 되지 않나?
// 클로드 답안: answer에 num_list 마지막 길이 인덱스의 답부터 넣으면 됨

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
}
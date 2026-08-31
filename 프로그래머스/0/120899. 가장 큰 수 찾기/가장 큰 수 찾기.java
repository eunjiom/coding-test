class Solution {
    public int[] solution(int[] array) {
        int maxValue = array[0]; // 최댓값 저장할 변수, 일단 첫 번째 값으로 시작
        int maxIndex = 0;        // 최댓값의 인덱스 저장할 변수
        
        // 배열 돌면서 현재 값이 maxValue보다 크면 갱신
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        
        int[] answer = {maxValue, maxIndex};
        return answer;
    }
}
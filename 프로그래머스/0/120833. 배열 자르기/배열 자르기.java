class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // num1부터 num2까지의 인덱스 개수만큼 배열 크기를 정함 (양 끝 포함이라 +1)
        int answer[] = new int [num2-num1+1];
        for(int i = 0; i < answer.length; i++)
             // numbers 배열에서 num1부터 시작하는 값을 순서대로 answer에 채워 넣음
            answer[i] = numbers[num1+i];
        return answer;
    }
}
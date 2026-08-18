class Solution {
    public int[] solution(String[] strlist) {
        // strlist 배열과 같은 길이의 결과 배열 생성
        int[] answer = new int[strlist.length];
        
        // 배열의 각 문자열을 순서대로 확인
        for (int i = 0; i < strlist.length; i++) {
            // i번째 문자열의 길이를 구해서 answer의 i번째 자리에 저장
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}
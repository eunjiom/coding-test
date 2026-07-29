class Solution {
    public String solution(String my_string, int n) {
        // 문자를 이어 붙일 StringBuilder 생성
        StringBuilder answer = new StringBuilder();
        // my_string의 각 문자를 하나씩 순회
        for(int i= 0; i < my_string.length(); i++){
            // 현재 문자(my_string의 i번째 문자)를 n번 반복해서 추가
            for(int j=0; j < n; j++)
                answer.append(my_string.charAt(i)); //answer에 이어 붙임
        }
        // StringBuilder를 String으로 변환해서 반환
        return answer.toString();
    }
}

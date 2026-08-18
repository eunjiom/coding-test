class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 문자열의 글자를 하나씩 순서대로 꺼내서 확인
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i); // i번째 글자를 c에 저장
            
            // 지금 이 글자 c가 숫자(0~9)인지 확인
            if (Character.isDigit(c)) {
                // c가 숫자라면, 글자를 진짜 숫자값으로 바꿔서 answer에 더함
                // (컴퓨터는 '0'~'9'를 순서대로 번호로 저장하고 있어서
                //  글자에서 '0'을 빼면 그 차이가 진짜 숫자가 됨. 예: '1'-'0' = 1)
                answer += (c - '0');
            }
            // 숫자가 아니면 아무것도 안 하고 다음 글자로 넘어감
        }
        
        return answer;
    }
}
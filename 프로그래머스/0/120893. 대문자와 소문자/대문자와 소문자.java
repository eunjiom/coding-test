class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        // 각 문자를 하나씩 확인
        for (char c : my_string.toCharArray()) {
            // 대문자면 소문자로, 소문자면 대문자로 변환해서 추가
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        
        return sb.toString();
    }
}
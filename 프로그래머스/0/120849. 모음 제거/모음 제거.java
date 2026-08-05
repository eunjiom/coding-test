class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 정규식 [aeiou]에 해당하는 문자(모음)를 모두 빈 문자열로 치환 -> 모음 제거
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
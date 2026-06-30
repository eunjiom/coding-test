// String 뒤집는 메서드 사용하여 answer에 넣기
// 클로드: StringBuilder의 reverse() 메서드 사용

class Solution {
    public String solution(String my_string) {
        StringBuilder my_string_rv = new StringBuilder(my_string);
        String answer = my_string_rv.reverse().toString();
        return answer;
    }
}
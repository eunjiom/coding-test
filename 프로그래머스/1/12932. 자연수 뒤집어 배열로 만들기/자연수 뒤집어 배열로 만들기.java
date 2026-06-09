// 입력: 자연수 n
// 출력: n을 뒤집어 각 자리수를 배열

// System.out.println(new StringBuilder(String.valueOf(n))
//         .reverse());

class Solution {
    public int[] solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] answer = new int [chars.length];
        for(int i=0; i < chars.length; i++){
            answer[i] = chars[chars.length -1 -i] -'0';
        }
        return answer;
    }
}
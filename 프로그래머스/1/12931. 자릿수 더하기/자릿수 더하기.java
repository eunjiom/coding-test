// 입력

// 로직
// String.valueOf(n).toCharArray() ->  {'1', '2', '3', '4' } : string으로 바꿔서 글자 나누기
// 숫자로 변환하는법
// for (char c : String.valueOf(n).toCharArray()) {
//            answer += c - '0';}
// 출력
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(char c : String.valueOf(n).toCharArray()){
            answer += c - '0';
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
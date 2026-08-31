class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        // s1의 원소를 하나씩 꺼내서
        for (String a : s1) {
            // s2에도 같은 게 있는지 하나씩 비교
            for (String b : s2) {
                if (a.equals(b)) {
                    answer++;
                    break; // 같은 거 찾았으면 다음 s1 원소로
                }
            }
        }
        
        return answer;
    }
}
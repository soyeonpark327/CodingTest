class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(c > 90) { // Z(90)보다 크다면? (소문자라면)
                // answer += c - 32; <- 문자에 연산을 하면 int로 자동 형 변환
                answer += (char)(c - 32); // 그래서 문자(char)로 형 변화 해야 함.
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}
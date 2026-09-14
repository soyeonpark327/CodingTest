class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        // 소문자 -> 97~122, 대문자 -> 65~90 (소문자 대문자화 하려면 -32)
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c == alp.charAt(0)) {
                c -= 32;
                answer += c;
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
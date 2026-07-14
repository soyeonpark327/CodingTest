class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 대소문자 차(아스키코드): 33
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 97){
                c -= 32;
                answer += c;
            } else{
                c += 32;
                answer += c;
            }
        }
        return answer;
    }
}
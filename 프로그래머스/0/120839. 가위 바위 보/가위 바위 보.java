class Solution {
    public String solution(String rsp) {
        // 2 -> 0 / 0 -> 5 / 5 -> 2
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            char c = rsp.charAt(i);
            if(c == '2'){
                answer += "0";
            } else if(c == '0'){
                answer += "5";
            } else if(c == '5'){
                answer += "2";
            }
        }
        return answer;
    }
}
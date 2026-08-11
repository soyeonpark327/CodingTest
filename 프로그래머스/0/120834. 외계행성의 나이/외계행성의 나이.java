class Solution {
    public String solution(int age) {
        String agstr = Integer.toString(age);
        String answer = "";
        
        for(int i = 0; i < agstr.length(); i++){
            char agc = agstr.charAt(i); // '0' <= 48
            agc += 49;
            String ag2 = String.valueOf(agc);
            answer += ag2;
        }
        
        
        return answer;
    }
}
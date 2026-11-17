class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(c >= 'A' && c <= 'Z') {
               answer += (char)(c + 32);
            } else {
                answer += c;
            }
        }
        String trueAnswer = "";
        for(int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if(c == 'a') {
                trueAnswer += 'A';
            } else {
                trueAnswer += c;
            }
        }
        return trueAnswer;
    }
}
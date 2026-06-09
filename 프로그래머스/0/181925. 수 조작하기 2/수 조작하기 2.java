class Solution {
    public String solution(int[] numLog) {
        String answer = "";
           
        for(int i = 1; i < numLog.length; i++){
            // + 연산자는 양쪽 모두 숫자일 땐 덧셈이지만, 
            // 한쪽이라도 문자열이면 자석처럼 두 값을 이어붙이는 역할을 함.
            
            if(numLog[i-1] - numLog[i] == -1){ // 1이 더해진 경우 (s)
                answer += "w";
            } else if(numLog[i-1] - numLog[i] == 1){ // 1을 뺀 경우 (w)
                answer += "s";
            } else if(numLog[i-1] - numLog[i] == -10){ // 10을 더한 경우 (d)
                answer += "d";
            } else if(numLog[i-1] - numLog[i] == 10){ // 10을 뺀 경우 (a)
                answer += "a";
            }
        }
        
        return answer;
    }
}
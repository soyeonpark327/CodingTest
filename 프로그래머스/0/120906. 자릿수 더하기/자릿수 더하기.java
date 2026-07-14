class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // int => String 형 변환
        String str = String.valueOf(n);
        
        for(int i = 0; i < str.length(); i++){
            // String => char 형 변환
            char c = str.charAt(i);
            // char => int 형 변환
            int num = c - '0';
            answer += num;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            // 아스키코드 0 = 48, 9 = 57
            if(c >= 48 && c <= 57){ // 0~9 사이의 수일 때
                // Character.getNumericValue() <- char의 int화 (문자의 정수화)
                int n = Character.getNumericValue(c);
                answer += n;
            }
        }
        
        return answer;
    }
}
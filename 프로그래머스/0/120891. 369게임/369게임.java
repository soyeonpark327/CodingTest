class Solution {
    public int solution(int order) {
        // 문자열화
        String num = order + "";
        int answer = 0;
        
        for(int i = 0; i < num.length(); i++){
            // 문자열 하나씩 뺴기
            char c = num.charAt(i);
            if(c == '3'){
                answer++;
            } else if(c == '6'){
                answer++;
            } else if(c == '9'){
                answer++;
            }
        }
        
        return answer;
    }
}
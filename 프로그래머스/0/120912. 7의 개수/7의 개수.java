class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 1. 배열의 정수 내용물을 문자열로 바꾸기 String.valueOf()
        // 2. 문자열에서 글자 하나씩 추출하기 .charAt()
        
        for(int i = 0; i < array.length; i++){
            String str = String.valueOf(array[i]); // 정수 => 문자열
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j); 
                if(c == '7'){
                answer++;
                }
            }
        } 
        
        return answer;
    }
}
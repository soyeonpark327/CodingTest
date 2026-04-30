class Solution {
    public int solution(String num_str) {
        int sum = 0;
        // (문자열 변수).charAt(꺼낼 글자의 인덱스)
        
        // char a = num_str.charAt(0); 
        //문자열 첫번째 자리에 있는 글자 char로 떼오기
        
        // char b = num_str.charAt(num_str.length() - 1); 
        //문자열의 마지막 자리에 있는 글자 char 떼오기
        
        for(int i = 0; i < num_str.length(); i++){ //메서드 호출하려면 소괄호 쓰셈.
            char c = num_str.charAt(i);
            int n = c - '0'; // 정수화 (아스키테이블 이용)
            sum += n;
        }
        return sum;
    }
}
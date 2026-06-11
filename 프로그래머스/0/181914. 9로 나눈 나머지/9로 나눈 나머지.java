class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            int turn = Character.getNumericValue(c); // 정수화
            sum += turn;
        }
        
        answer = (sum % 9);
        
        return answer;
        
        // 문자열(String) => 정수(int) 변환
        // 방법1. Interger.valueOf()
        // 방법2. Integer.parseInt()
        
        // 정수(int) => 문자열(String) 변환
        // 방법1. String.valueOf() 
        // 방법2. Integer.toString()
        // 방법3. int + "" 
        
        // 문자(char) => 정수(int) 변환
        // Character.getNumericValue()
    }
}
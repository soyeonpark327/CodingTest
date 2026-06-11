class Solution {
    public int solution(int a, int b) {
        // a ⊕ b와 2 * a * b 중 더 큰 값
        int answer = 0;
        
        // 1. 문자열화
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        // 2. 문자열 이어붙이기
        String plus = str1 + "" + str2;
            
        // 3. 정수화
        int A = Integer.valueOf(plus);
        
        int B = (2 * a * b);
        
        if(A > B){
            answer = A;
        }else{
            answer = B;
        }
        
        return answer;
    }
}
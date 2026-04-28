class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 == 1 && b % 2 == 1){
            answer = a*a + b*b;
        } else if(a % 2 == 1 || b % 2 == 1){
            answer = 2 * (a+b);
        } else if(a % 2 == 0 && b % 2 == 0){
            answer = Math.abs(a - b);
        }
        return answer;
        // 두 식이 모두 true이면 true 출력, && (AND)
        // 하나라도 true면 true 출력, || (OR)
        
        // Math.abs() <-- 자바에서 절댓값을 구할 수 있는 메소드
    }
}
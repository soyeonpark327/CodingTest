class Solution {
    public int solution(int n) { // 최대 n값 10!
        int sum = 1;
        int answer = 1;
        
        for(int i = 0; i <= 10; i++){
            sum *= answer;
            
            if(sum <= n){
                answer++;
            } else{
                break;
            }
        }
        
        return (answer - 1);
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 1;
        int sum2 = 0;
        
        for(int i = 0; i < num_list.length; i++){
            sum1 *= num_list[i]; //모든 원소들의 곱
            sum2 += num_list[i]; //모든 원소들의 합
        } 
        
        int jj = sum2*sum2; //모든 원소들의 합의 제곱
            
        if (sum1 < jj){
            answer = 1;
        } else if(sum1 > jj){
            answer = 0;
        } 
            
        return answer;
    }
}
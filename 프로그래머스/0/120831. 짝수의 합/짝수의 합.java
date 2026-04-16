class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int answer = 0; answer <= n; answer++){
            if(answer%2==0){
                sum += answer;
            } 
        }
        return sum;
    }
}
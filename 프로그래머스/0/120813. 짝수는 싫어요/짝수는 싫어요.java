class Solution {
    public int[] solution(int n) {
        // 홀수 개수 계산
        int count = (n + 1) / 2;
        int[] answer = new int[count]; 
        
        int index = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){ // i가 홀수이면?
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
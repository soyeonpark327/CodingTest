class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 5보다 크면? 5로 계속 나누기
        // 3보다 크면? 3으로 계속 나누기
        // 1보다 크면? 1로 계속 나누기
        
        if(hp >= 5){
            while(hp >= 5){
                hp -= 5;
                answer++;
            }
        }
        if(hp >= 3){
            while(hp >= 3){
                hp -= 3;
                answer++;
            }
        }
        if(hp >= 1){
            while(hp >= 1){
                hp -= 1;
                answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        // answer(피자 판 수)
        // pnum(피자 조각 수) <= 6의 배수
        
        for(int pnum = 1; pnum < 600; pnum++){
            if(pnum % 6 == 0 && pnum % n == 0){
                answer = (pnum / 6);
                break;
            }
        }
        
        return answer;
    }
}
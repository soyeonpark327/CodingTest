class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int index = 0;
        int another = 0;
        
        for(int i = 0; i < sides.length; i++){
            if(max < sides[i]){ 
                max = sides[i]; // 가장 긴 변 구하기
                index = i;
            }
        }
        
        for(int i = 0; i < sides.length; i++){
            if(i != index){
                another += sides[i]; // 다른 두 변의 합 구하기
            }
        }
        
        if(another > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
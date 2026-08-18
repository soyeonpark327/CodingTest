class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int ind2 = total / num;
        
        for(int i = 0; i < num; i++){
            answer[i] = ind2 - (num - 1) / 2;
            ind2++;
        }
        
        return answer;
    }
}
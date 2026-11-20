class Solution {
    public int[] solution(int[] num_list, int n) {
        int index = 0; 
        
        for(int i = (n - 1); i < num_list.length; i++) {
            index++;
        }
        
        int[] answer = new int[index];
        
        int idx2 = 0;
        
        for(int i = (n - 1); i < num_list.length; i++) {
            answer[idx2++] = num_list[i];
        }
        
        return answer;
    }
}
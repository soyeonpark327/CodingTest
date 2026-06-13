class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int sum_j = 0;
        int sum_h = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                sum_j++;
            }else{
                sum_h++;
            }
        }
        
        answer[0] = sum_j;
        answer[1] = sum_h;
        
        return answer;
    }
}
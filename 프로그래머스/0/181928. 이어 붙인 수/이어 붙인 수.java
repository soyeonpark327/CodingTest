class Solution {
    public int solution(int[] num_list) {
        int h = 0;
        int j = 0;
        int hmul = 1;
        int jmul = 1;
        
        for(int i = num_list.length - 1; i >= 0; i--){
            if(num_list[i] % 2 == 1){
                h += (num_list[i] * hmul);
                hmul *= 10;
            }else{
                j += (num_list[i] * jmul);
                jmul *= 10;
            }
        }
        int answer = j + h;
        return answer;
    }
}
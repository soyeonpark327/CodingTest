class Solution {
    public int[] solution(String my_string) {
        int index = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(48 <= c && c<= 57){
                index++;
            }
        }
        
        int[] answer = new int[index];
        
        int z = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(48 <= c && c<= 57){
                answer[z] = c - '0';
                z++;
            }
        }
        
        for(int i = 0; i < answer.length; i++){
            for(int j = (i  + 1); j < answer.length; j++){
                if(answer[i] > answer[j]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}
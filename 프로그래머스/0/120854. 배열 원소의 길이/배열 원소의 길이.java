class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int count = 0;
        
        for(int i = 0; i < strlist.length; i++){
            String s = strlist[i];
            
            for(int j = 0; j < s.length(); j++){
                count++;
                
            }
            answer[i] = count;
            count = 0;
        }
        
        return answer;
    }
}
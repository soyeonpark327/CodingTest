class Solution {
    public String solution(String my_string) {
        char[] mo = {'a', 'e', 'i', 'o', 'u'};
        String answer = "";
        boolean m = false;
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            for(int j = 0; j < mo.length;  j++){
                if(c == mo[j]){
                    m = true;
                }
            }
            if(m == false){
                answer += c;
            }
            m = false; // 다시 복구
        }
        
        return answer;
    }
}
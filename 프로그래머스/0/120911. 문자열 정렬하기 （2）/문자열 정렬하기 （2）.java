import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c < 97){
                c += 32;
            }
            answer += c;
        }
        
        // 문자열 answer를 char 배열로 변환
        char[] strArr = answer.toCharArray();
        
        // Arrays.sort()로 문자 정렬 (오름차순)
        Arrays.sort(strArr);
        
        // char 배열 다시 문자열로 변환
        String realAnswer = new String(strArr);
        
        return realAnswer;
    }
}
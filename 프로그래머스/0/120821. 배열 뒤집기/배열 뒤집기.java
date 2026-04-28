class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length; // num_list[]의 배열 길이
        int[] answer = new int[length]; // answer의 길이가 num_list와 같아야 함
        for(int i = 0; i < length; i++){
            answer[i] = num_list[length-1-i]; 
            // num_list의 방 수를 하나씩 줄여나가며 거꾸로 대입
        }
        return answer;
        
        // num_list[]의 원소를 반대로 뒤집은 배열 answer[] 
    }
}
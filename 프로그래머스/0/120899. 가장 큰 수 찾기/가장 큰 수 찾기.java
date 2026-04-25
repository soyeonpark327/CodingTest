import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2]; //배열 방 크기 잡기
        int max = array[0]; //가장 큰 값
        int idx = 0; //가장 큰 값의 인덱스 번호 저장
        for(int i = 0; i < array.length; i++){
            if(array[i] > max)/* 만약 array[i]가 최댓값이라면? */ {
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx;
        
        return answer;
    }
}
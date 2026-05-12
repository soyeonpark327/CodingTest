class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(int i = 0; i < control.length(); i++){ //문자열의 길이만큼 반복문 돌리기
            char c = control.charAt(i); //문자열의 i번째 위치에 있는 문자열을 하나씩 꺼냄
            if(c == 'w'){
                answer += 1;
            } else if(c == 's'){
                answer -= 1;
            } else if(c == 'd'){
                answer += 10;
            } else {
                answer -= 10;
            }
        }
        return answer;
    }
}
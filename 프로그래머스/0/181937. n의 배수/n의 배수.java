class Solution {
    public int solution(int num, int n) {
        int answer = 0; //0으로 answer 정의
        if (num%n == 0) {
            answer = 1; // 이미 int로 정의 됐으니까 변수만 대입
        }
        else {
            answer = 0;
        }
        return answer;
    }
}
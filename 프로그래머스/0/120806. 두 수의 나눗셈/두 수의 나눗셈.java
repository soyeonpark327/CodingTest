class Solution {
    public int solution(int num1, int num2) {
        double dd = num1;
        double cc = num2;
        int answer = (int) (dd/cc * 1000);
        return answer;
        
        // 오답...
        // double dd = (num1/num2);
        // int answer = (int) (dd*1000);
    }
}
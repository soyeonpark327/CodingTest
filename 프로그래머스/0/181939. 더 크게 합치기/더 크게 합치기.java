class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = a + "";
        String strB = b + "";
        String ver1 = strA + strB;
        String ver2 = strB + strA;
        // String => int: Integer.valueOf(str) 사용
        int one = Integer.valueOf(ver1);
        int two = Integer.valueOf(ver2);
        if(one > two){
            answer = one;
        } else {
            answer = two;
        }
        return answer;
    }
}
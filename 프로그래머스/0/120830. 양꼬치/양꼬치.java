class Solution {
    public int solution(int n, int k) {
        int a = n/10;
        int total = (12000*n) + (2000*k);
        if(a>0){
            return total-(a*2000);
        }
        return total;
    }
}
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a != b && b != c && a != c){
                     answer = a + b + c;
                    // 세 숫자 모두 다를 때
            return answer;
        }
          
        else if(a == b && a ==c){
                answer = (a + b + c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
                // 세 숫자 모두 같을 때
            return answer;
        }

        
        else{
                answer = (a + b + c)*(a*a + b*b + c*c);
                return answer;
            }
        }

}
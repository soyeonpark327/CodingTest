class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i = 0; i < order.length; i++){
            // 문자열 비교방식 .equals("") <- 꼭 기억!!!!!
            if(order[i].equals("iceamericano") || order[i].equals("americanoice")){
                answer += 4500;
            } else if(order[i].equals("hotamericano") || order[i].equals("americanohot")){
                answer += 4500;
            } else if(order[i].equals("icecafelatte") || order[i].equals("cafelatteice")){
                answer += 5000;
            } else if(order[i].equals("hotcafelatte") || order[i].equals("cafelattehot")){
                answer += 5000;
            } else if(order[i].equals("americano") || order[i].equals("anything")){
                answer += 4500;
            } else if(order[i].equals("cafelatte")){
                answer += 5000;
            }
        }
        return answer;
    }
}
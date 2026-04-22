class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i]; //더한 값을 대입해야 축적이 됨.
        }
        return (answer/numbers.length);
    }
}
class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int maxIndex = 0;
        int[] arr = new int[numbers.length - 1];
        
        // 1. 가장 큰 수 구하기
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                maxIndex = i;
            }
        }
        
        int index = 0;
        
        for(int i = 0; i < numbers.length; i++){
                if(i != maxIndex){
                    arr[index] = numbers[i];
                    index++;
                }
            }
        
        int max2 = 0;
        
        // 2. 두번째로 큰 수 구하기
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        
        int answer = (max * max2);
        return answer;
    }
}
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        double an2 = 0.0;
        
        for(int i = 0; i < array.length; i++){
            for(int j = (i + 1); j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < array.length; i++){
            if(array.length % 2 == 0){
                answer = (array[(array.length / 2) - 1] + array[(array.length / 2)]) / 2;
            }else{
                answer = array[(array.length / 2)];
            }
        }
        
        return answer;
    }
}
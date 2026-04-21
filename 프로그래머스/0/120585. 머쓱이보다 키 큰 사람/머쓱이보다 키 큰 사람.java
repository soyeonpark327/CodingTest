class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for(int i=0; i<array.length; i++){
            int anotherHeight = array[i];
            if(anotherHeight > height) {
                count++;
            }
        }
        return count;
    }
}
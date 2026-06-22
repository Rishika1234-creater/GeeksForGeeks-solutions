class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num>largest){
                largest = num;
            }
        }
        for(int num : arr){
            if(num!=largest&&num>secondLargest){
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
}

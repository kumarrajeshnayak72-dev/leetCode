class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int n: arr){
            if(n ==0){
                zeros++;
            }
        }
        int [] res = new int[arr.length+zeros];
        int k=  0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != 0){
                res[k] = arr[i];
                k++;
            }else{
                res[k] = 0;
                res[k+1] = 0;
                k+=2;
            }
        }
        for(int i = 0; i < arr.length;i++){
            arr[i] = res[i];
        }
    }
}
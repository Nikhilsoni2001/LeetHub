class Solution {
  boolean isValid(int arr[],int left,int right){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=left&&arr[m]<=right)return false;
            if(arr[m]<left)l=m+1;
            else r=m-1;
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       Arrays.sort(arr2);
        int count=0;
        for(int num : arr1){
           if(isValid(arr2,num-d,num+d))count++;      
        }
        return count;
    }
}
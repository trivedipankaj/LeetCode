public class Solution {
    public int findPeakElement(int[] num) {
        return findPeak(num,0,num.length-1);
    }
    
    public int findPeak(int[] num, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if( (mid+1 ==num.length || num[mid] > num[mid+1]) && ( mid==0 || num[mid]>num[mid-1]) ){
            return mid;
        }else if(mid-1>=0 && num[mid-1] > num[mid]){
            return findPeak(num,start,mid-1);
        }else{
            return findPeak(num,mid+1,end);
        }
        
    }
}

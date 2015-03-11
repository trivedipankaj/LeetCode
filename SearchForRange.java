package leetcode;

public class Solution {
    public int[] searchRange(int[] A, int target) {
        int key = BSearch(A,target,0,A.length-1);
        int[] res= new int[2];
        res[0]=-1; res[1]=-1;
        if(key==-100000){
            return res;
        }
        int start=key;
        int end=key;
        while(start>0 && A[start-1]==target){
            start--;
        }
        while(end<A.length-1&&A[end+1]==target){
            end++;
        }
        res[0]=start;res[1]=end;
        return res;
    }
    
    public int BSearch(int[] arr, int k, int start, int end){
		if(start<=end){
			int mid = (start+end)/2;
			if(arr[mid]==k){
				return mid;
			}
			if(k < arr[mid]){
				return BSearch(arr,k,start,mid-1);
			}
			return BSearch(arr,k,mid+1,end);
		}
		return -100000;
	}
}

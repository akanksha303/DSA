package binarysearch;

public class searchinsert {
    public int searchi(int arr [], int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n; // Default to end if x is greater than all elements

        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid]<= target){
                ans= mid;
                high= mid-1;
            }
            else{
                low= mid +1;
            }

        }
        return ans;
    }

    public static void main (String args[]){
        int [] arr = {1,2,3,5,6};
        int x=4;
        searchinsert obj = new searchinsert();
        int index = obj.searchi(arr,x);
        System.out.println(index);
    }
    
}

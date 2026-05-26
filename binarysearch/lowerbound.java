package binarysearch;

public class lowerbound {

    public int findLowerBound(int [] arr, int x){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;

        while (low <= high){
            int mid = (low+high)/2;

            if (arr[mid]>=x){
                ans=mid;
                high = mid - 1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        int [] arr = {3,5,8,15,19};
        int x = 9;

      lowerbound fn = new lowerbound();
      int ind = fn.findLowerBound(arr, x);                  // Find lower bound

        System.out.println("The lower bound is the index: " + ind);  // Print result

    }


}

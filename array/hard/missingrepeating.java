public class missingrepeating {

    public static int[] repeatmissing(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        int repeating = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int j = 1; j <= n; j++) {
            if (freq[j] == 2) repeating = j;
            if (freq[j] == 0) missing = j;
        }

        return new int[]{repeating, missing};
    }


    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        int[] result = repeatmissing(nums);

        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
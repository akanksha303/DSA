import java.util.Scanner;

public class Maxcard {
    public static int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;

        // Take first k cards initially
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += cardScore[i];
        }

        int maxSum = currentSum;

        // Replace cards from front with cards from back
        int rightIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            currentSum -= cardScore[i];          // remove from front
            currentSum += cardScore[rightIndex]; // add from back
            rightIndex--;

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        int[] cardScore = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            cardScore[i] = sc.nextInt();
        }

        // Input k
        int k = sc.nextInt();

        int result = maxScore(cardScore, k);

        System.out.println("Maximum Score: " + result);

        sc.close();
    }
}

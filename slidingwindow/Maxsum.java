import java.util.Scanner;

public class Maxsum {

    public static int maxScore(int[] cardScore, int k) {

        int n = cardScore.length;

        // Step 1:
        // Take first k cards from the front
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += cardScore[i];
        }

        // Store the maximum score
        int maxSum = currentSum;

        // Step 2:
        // Replace cards from front with cards from back one by one
        int rightIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {

            // Remove one card from front part
            currentSum -= cardScore[i];

            // Add one card from back part
            currentSum += cardScore[rightIndex];

            // Move right pointer
            rightIndex--;

            // Update maximum score
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        int[] cardScore = new int[n];

        // Input array elements
        System.out.println("Enter card scores:");

        for (int i = 0; i < n; i++) {
            cardScore[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Function call
        int result = maxScore(cardScore, k);

        // Output result
        System.out.println("Maximum score = " + result);

        sc.close();
    }
}
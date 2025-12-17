import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentCount = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        System.out.println(maxCount);
    }
}

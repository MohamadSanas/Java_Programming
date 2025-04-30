package Activity;

import java.util.Scanner;

public class Main3 {
    public static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void MaxActivities(int s[], int f[], int n) {
        int i = 0;
        System.out.println("Following activities are selected");
        System.out.print(i + " ");

        for (int j = 1; j < n; j++) {
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of events:");
        int num = input.nextInt();
        int[][] event = new int[num][2];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the start time of event " + i + ": ");
            event[i][0] = input.nextInt();  // Start time
            System.out.print("Enter the finish time of event " + i + ": ");
            event[i][1] = input.nextInt();  // Finish time
        }

        // Sort events by finish time using bubble sort
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (event[j][1] > event[j + 1][1]) {
                    swap(event, j, j + 1);
                }
            }
        }

        // Extract sorted start and finish times into separate arrays
        int[] startTimes = new int[num];
        int[] finishTimes = new int[num];
        for (int i = 0; i < num; i++) {
            startTimes[i] = event[i][0];
            finishTimes[i] = event[i][1];
        }

        MaxActivities(startTimes, finishTimes, num);

        input.close();
    }
}

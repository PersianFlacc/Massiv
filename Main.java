import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] mass = new int[50];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(101) - 50;
        }

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                negativeCount++;
                negativeSum += mass[i];
            } else if (mass[i] > 0) {
                positiveCount++;
                positiveSum += mass[i];
            } else {
                zeroCount++;
            }

            sum += mass[i];
        }

        double average = (double) sum / mass.length;

        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
        System.out.println("Sum of positive elements: " + positiveSum);
        System.out.println("Sum of negative elements: " + negativeSum);
        System.out.println("Average value: " + average);
    }
}
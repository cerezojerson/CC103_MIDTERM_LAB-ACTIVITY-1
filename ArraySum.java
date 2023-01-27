public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 8, 1, 2, 9, 55, 23, 55, 33, 44};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of all elements are: " + sum);
    }
}

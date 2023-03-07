package classwork.lesson5;

public class DebugExample {

    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7};


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        numbers[0] = 11;
        numbers[1] = 22;
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}

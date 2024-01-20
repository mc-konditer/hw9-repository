import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        int[] array = generateRandomArray();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Сумма трат за месяц - " + sum);

    }

    public static void task2() {
        int[] array = generateRandomArray();
        System.out.println(Arrays.toString(array));

        int minValue = array[0];
        int maxValue = array[0];

        for (int value : array) {

            if (value < minValue) {
                minValue = value;
            }

            if(value>maxValue){
                maxValue=value;
            }

        }

        System.out.println("Минимальное значение - " + minValue);
        System.out.println("Максимальное значение - " + maxValue);
    }

    public static void task3(){
        int[] array = generateRandomArray();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Средняя сумма трат - " + sum/array.length);
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i= reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);;
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
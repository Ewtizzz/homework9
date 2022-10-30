public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //1
        int sumViplat = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sumViplat += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumViplat + " рублей");
        //2
        int maxTrat = 0;
        int minTrat = 200000;
        int[] arr2 = generateRandomArray();
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > maxTrat){
                maxTrat = arr2[i];
            }if(arr2[i] < minTrat){
                minTrat = arr2[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minTrat + " рублей. Максимальная сумма трат за день составила " + maxTrat + " рублей.");
        //3
        int[] arr3 = generateRandomArray();
        double sredTrat = 0;
        int days = 30;
        double sumTrat = 0;
        for (int i = 0; i < arr3.length; i++) {
            sumTrat += arr3[i];
        }
        sredTrat = sumTrat/days;
        System.out.println("Средняя сумма трат за месяц составила " + sredTrat + " рублей");
        //4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String fullName = "";
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            fullName += reverseFullName[i];
        }
        System.out.println(fullName);
    }
}
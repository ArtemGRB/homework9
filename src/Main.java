public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("\n--------Задание 1----------");
        int[] spending1 = {35_000, 20_000, 12_000, 56_000, 32_000};
        int allSpending1 = 0;

        for (int i : spending1) {
            allSpending1 += i;
        }
        System.out.println("Сумма трат за месяц составила " + allSpending1 + " рублей");

        //Задание 2
        System.out.println("\n--------Задание 2----------");
        int[] spending2 = {678_442, 298_347, 238_948, 28_738, 192_738};
        int minSpending = spending2[0];
        int maxSpending = 0;

        for (int i : spending2) {
            if (i < minSpending) {
                minSpending = i;
            }
            if (i > maxSpending) {
                maxSpending = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxSpending + " рублей");

        //Задание 3
        System.out.println("\n--------Задание 3----------");
        int[] spending3 = {83_747, 842_749, 91_831, 723_487, 821_739};
        float average;
        float allSpending3 = 0;

        for (float i : spending3) {
            allSpending3 += i;
        }
        average = allSpending3 / spending3.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание 4
        System.out.println("\n--------Задание 4----------");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        int lengthArray = reverseFullName.length - 1;

        for (char i : reverseFullName) {
            fullName[lengthArray] = i;
            lengthArray--;
        }
        for (char j : fullName) {
            System.out.print(j);
        }
    }
}
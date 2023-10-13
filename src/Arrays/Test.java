package Arrays;

public class Test {
    public static void main(String[] args) {
//Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(numbers[i]);
//        }

//Вывести первую половину массива (Вывести первую половину элементов массива при помощи цикла for).
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < (numbers.length / 2); i++) {
//            System.out.println(numbers[i]);
//        }

//Вывести вторую половину массива (Вывести вторую половину элементов массива при помощи цикла for). Реализация задачи должна работать при любом чётном количестве элементов.
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = numbers.length / 2; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//Вывести все элементы кроме первого и последнего.
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 1; i < numbers.length - 1; i++) {
//            System.out.println(numbers[i]);
//        }

//Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11] вывод должен быть таким: 99, 2, 11)
//        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
//        for (int i = (numbers.length / 2) + 2; i < numbers.length; i++) {
//            System.out.print(numbers[i - 1] + ", ");
//        }
//        System.out.print(numbers[7]);

//Вывести чётные элементы массива по порядку (Вывести только чётные элементы массива по порядку (каждый второй элемент).
//Необходимо будет вывести второй, четвёртый, шестой и т.д. элементы. Позиции (индексы) для необходимых элементов: 1, 3, 5...n (постоянное увеличение на 2).
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < numbers.length - 2; i += 2) {
//            System.out.print(numbers[i] + ", ");
//        }
//        System.out.println(numbers[numbers.length - 2]);

//Вывести количество положительных и отрицательных элементов (Необходимо определить количество положительных и отрицательных элементов в массиве и вывести его).
//        int[] numbers = {-10, 20, -5, -2, -3, 4, 5, 7};
//        int positiveCount = 0;
//        int negativeCount = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0) {
//                positiveCount++;
//            } else {
//                negativeCount++;
//            }
//        }
//        System.out.println("Количество положительных чисел: " + positiveCount);
//        System.out.println("Количество отрицательных чисел: " + negativeCount);

//Найти максимальный и минимальный элементы массива (Необходимо определить максимальный и минимальный элементы в массиве и вывести их).
//        int[] numbers = {-10, 20, -5, -2, -3, 4, 5, 7};
//        int maxNum = 1;
//        int minNum = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > maxNum) {
//                maxNum = numbers[i];
//            }
//            if (numbers[i] < minNum) {
//                minNum = numbers[i];
//            }
//        }
//        System.out.println("Максимальное число: " + maxNum);
//        System.out.println("Минимальное число: " + minNum);

//    Вывести первую треть массива при помощи цикла do-while.
//    Реализация задачи должна работать при количестве элементов, кратном трем.
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int i = 0;
//        do {
//            System.out.println(nums[i]);
//            i++;
//        } while (i < 3);

//    Вывести элементы массива в обратном порядке, используя цикл for.
//    Начните с последнего элемента массива и двигайтесь к первому.
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        for (int i = nums.length - 1; i > 0; i--) {
//            System.out.print(nums[i] + ", ");
//        }
//        System.out.println(nums[0]);

//    Вывести элементы массива, которые больше среднего арифметического всех его элементов.
//    Сначала вычислите среднее значение всех элементов массива, а затем выведите те из них, которые больше этого среднего значения.
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = (nums[i] + sum) / 2;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (sum < nums[i]) {
//                System.out.println(nums[i]);
//            }
//        }

//     Найти среднее арифметическое всех нечётных элементов массива.
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                sum = nums[i] + sum;
//            }
//        }
//        System.out.println(sum / 2);

//     Найти и вывести два наименьших уникальных элемента массива.
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int minNum = 0;
//        int min2 = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < minNum) {
//                minNum = nums[i];
//            }
//            if (minNum < min2) {
//                min2 = minNum;
//            }
//        }
//        System.out.println("Самое минимальное число: " + minNum);
//        System.out.println("Предпоследнее число:  " + min2);
//
//
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int lowerBound = 0;
//        int upperBound = nums.length;
//
//
//
//        int range = upperBound - lowerBound;
//
//        System.out.println("Random Array Elements:");
//        // access 5 random array elements
//        for (int i = 0; i < upperBound + 1; i++) {
//            int random = (int) (Math.random() * range) + lowerBound;
//
//
//            System.out.print(nums[random] + ", ");
//        }
//
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int lowerBound = 0;
//        int upperBound = nums.length;
//
//        int range
//
//        System.out.println("Random Array Elements:");
//
//        for (int i = 0; i < upperBound + 1; i++) {
//            int random = (int) (Math.random() * range) + lowerBound;
//
//
//            System.out.print(nums[random] + ", ");
//        }

    }
}

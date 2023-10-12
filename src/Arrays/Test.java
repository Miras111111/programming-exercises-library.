package Arrays;

public class Test {
    public static void main(String[] args) {
//        1 - задача
// Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).

//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(numbers[i]);
//        }

//        2 - задача
//Вывести первую половину массива (Вывести первую половину элементов массива при помощи цикла for).

//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < (numbers.length / 2); i++) {
//            System.out.println(numbers[i]);
//        }

//        3 - задача
//
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = numbers.length / 2; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//          int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 1; i < numbers.length - 1 ; i++) {
//            System.out.println(numbers[i]);
//        } 4 - zadacha
//        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};
//        for (int i = (numbers.length / 2) + 1; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        } 5 - zadacha
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < numbers.length; i += 2) {
//            System.out.println(numbers[i]);
//        } 6 - zadacha
//        int[] numbers = {-10, 20, -5, -2, -3, 4, 5, 7};
//        int positiveCount = 0;
//        int negativeCount = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] > 0) {
//                positiveCount++;
//            } else{
//                negativeCount++;
//            }
//        }
//        System.out.println("Количество позитивных чисел: " + positiveCount);
//        System.out.println("Количество негативных  чисел: " + negativeCount); 7 - zadacha
//        int[] numbers = {-10, 20, -5, -2, -3, 4, 5, 7};
//        int max = 1;
//        int min = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i] ;
//            }
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println("Максимальное число: " + max);
//        System.out.println("Минимальное число: " + min);
//        Hobbits[] h = new Hobbits[3];
//        int z = 0;
//
//        while (z < 4) {
//            z = z + 1;
//            h[z] = new Hobbits();
//            h[z].name = "Бильбо";
//            if (z == 0) {
//                h[z].name = "Фродо";
//            }
//            if (z == 1) {
//                h[z].name = "Сэм";
//            }
//            System.out.print(h[z].name + " - ");
//            System.out.println("Имя прохожего хоббита");
//        }
//    }
//}
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int i = 0;
//        do {
//            System.out.println(nums[i]); i++;
//        } while(i<4); 9 - zadacha
//
//
//          int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//          for (int i = nums.length - 1; i >= 0; i --) {
//              System.out.println(nums[i]);
//          }
//
//
//            int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//            int sum = 0;
//            for (int i = 0; i < nums.length; i++) {
//                sum = (nums[i] + sum)/2;
//            }
//            for (int i = 0; i < nums.length; i++) {
//                if (sum < nums[i]) {
//                    System.out.println(nums[i]);
//                }
//              int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//              int sum = 0;
//              for (int i = 0; i < nums.length; i++) {
//                  if (nums[i] % 2 == 1) {
//                      sum = nums[i] + sum;
//                  }
//              }
//              System.out.println(sum/2);
//
//
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int min = 0;
//        int min2 = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//            if (min < min2) {
//                min2 = min;
//            }
//        }
//        System.out.println("Самое минимальное число: " + min);
//        System.out.println("Предпоследнее число: " + min2);
//
//
//        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
//        int lowerBound = 0;
//        int upperBound = nums.length;
//
//        // array.length will excluded
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

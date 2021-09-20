package lesson1;

import javax.imageio.ImageTranscoder;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        doBinary(new int[10]);
        System.out.println("___________________");
        System.out.println("Задание 2");
        fillArray(new int[100]);
        System.out.println("___________________");
        System.out.println("Задание 3");
        doItDouble(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("___________________");
        System.out.println("Задание 4");
        doDiagonal(new int[7][7]);
        System.out.println("___________________");
        System.out.println("Задание 5");
        printLessonFive(fillByValue(7, 10));
        System.out.println();
        System.out.println("___________________");
        System.out.println("Задание 6");
        findMinMax(19);
        System.out.println("___________________");
        System.out.println("Задание 7");
        System.out.println(checkTheSum(fillByValue(4, 2)));
        System.out.println("___________________");
        System.out.println("Задание 8");
        moveTheArrayValue(new int[]{2, 4, 6, 8,}, -5);

    }

    public static void doBinary(int[] array) {
        int random = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * random);
            System.out.print("до " + array[i] + " ");
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println("после " + array[i] + " ");
        }
    }

    public static void fillArray(int[] arrayBar) {
        for (int i = 0; i < arrayBar.length; i++) {
            arrayBar[i] = i + 1;
            System.out.print(arrayBar[i] + " ");
            if (arrayBar[i] % 20 == 0) {
                System.out.println(" ");
            }
        }
    }

    public static void doItDouble(int[] arr) {
        System.out.println("Все элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] + " ");
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(" ");
        System.out.println("Элементы массива меньше 6 умноженные на 2:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(" ");
    }


    public static void doDiagonal(int[][] cube) {
        for (int i = 0; i < cube.length; i++) {
            cube[i][i] = 1;
            cube[i][cube[i].length - 1 - i] = 1;
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print(cube[i][j] + " ");
            }
            System.out.println(" ");

        }
    }

    public static int[] fillByValue(int len, int initialValue) {
        int[] filledOne = new int[len];
        for (int i = 0; i < filledOne.length; i++) {
            filledOne[i] = initialValue;
        }
        return filledOne;
    }

    public static void printLessonFive(int[] printedOneArray) {
        for (int i = 0; i < printedOneArray.length; i++) {
            System.out.print(printedOneArray[i] + " ");
        }
    }

    public static void findMinMax(int arraylengthMultiple) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] newOneArray = new int[arraylengthMultiple];
        System.out.println("Элементы массива: ");
        for (int i = 0; i < newOneArray.length; i++) {
            if (i % 2 == 0) {
                newOneArray[i] = i * arraylengthMultiple * -1;
            } else {
                newOneArray[i] = i * arraylengthMultiple;
            }
            if (newOneArray[i] > max) {
                max = newOneArray[i];
            } else if (newOneArray[i] < min) {
                min = newOneArray[i];
            }
            System.out.print(newOneArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Значение минимального элемента массива = " + min);
        System.out.println("Значение максимального элемента массива = " + max);
    }

    public static boolean checkTheSum(int[] tempArray) {
        for (int i = 0; i < tempArray.length; i++) {
            int leftSideSum = 0;
            int rightSideSum = 0;
            for (int j = 0; j < i; j++) {
                leftSideSum += tempArray[j];
            }
            for (int k = i; k < tempArray.length; k++) {
                rightSideSum += tempArray[k];
            }
            if (leftSideSum == rightSideSum) {
                return true;
            }
        }
        return false;
    }

    public static void moveTheArrayValue(int[] array, int n) {
        System.out.println("Элементы массива до смещения: ");
        for (int b = 0; b < array.length; b++) {
            System.out.print(+array[b] + " ");}
        System.out.println(" ");
        int roundCheck = n % array.length;
        if (roundCheck != 0) {
            n = roundCheck;
            if (n > 0) {
                System.out.println("Элементы массива после смещения: ");
                for (int x = 0; x < n; x++) {
                    int temp = array[array.length - 1];
                    for (int i = array.length - 2; i >= 0; i--) {
                        array[i + 1] = array[i];
                    }
                    array[0] = temp;
                }
            } else {
                System.out.println("Элементы массива после смещения: ");
                for (int x = 0; x < n * -1; x++) {
                    int temp = array[0]; // 2
                    for (int i = 1; i < array.length; i++) {
                        array[i - 1] = array[i];
                    }
                    array[array.length - 1] = temp;
                }

                }
            for (int i = 0; i < array.length; i++) {
                System.out.print(+array[i] + " ");
            }

        }
    }
}





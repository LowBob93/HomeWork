public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("___________________________________");
        checkSumSign(50, 25);
        System.out.println("___________________________________");
        int check = (printColor(140));
        if (check < 0)
            System.out.println("Красный");
        else if (check == 0)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
        System.out.println("___________________________________");
        compareNumbers(40, 10); }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
         }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная"); }
        else {
            System.out.println("Сумма отрицательная"); }
        }

    public static int printColor(int value) {
        if (value <= 0) {
            return -1;
        } else if (value <= 100) {
            return 0;
        } else
            return 1;
    }
    public static void compareNumbers(int a, int b){
        if(a >=b) {
            System.out.println("a >= b"); }
        else {
            System.out.println("a < b"); }
    }
}


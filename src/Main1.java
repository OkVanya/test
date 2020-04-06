public class Main1 {
    public static void main(String[] args) {

        task1(2.5,1,12,6);
        task2(8,7);
        task3(-1);
        task4("Ирина");
    }

    public static double task1 (double a, int b, int c, int d) {
        return a *(b +(c /d));
    }

    public static boolean task2 (int g, int j) {
        int sum = (g + j);
        boolean bool = true;
        if (sum >= 10 && sum <= 20 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void task3 (int x) {
        if(x <= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

    public static void task4 (String y) {
        System.out.println("Привет," + y);
    }

}


public class Main1 {
    public static void main(String[] args) {
        byte b = 1;
        short t = 5;
        int i = 4;
        long l = 6;
        float f = (float) 2.35;
        double d = 3.25;
        boolean bool = false;
        char ch = 'a';

        task3(2,1,12,6);
        task4(8,7);
        task5(-1);
        task6(2);
        task7("Ирина");
    }

    public static int task3 (int a, int b, int c, int d) {
        return a *(b +(c /d));
    }

    public static boolean task4 (int g, int j) {
        int sum = (g + j);
        boolean bool = true;
        if (sum >= 10 && sum <= 20 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void task5 (int x) {
        if(x <= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }
    public static boolean task6 (int x) {
        if(x < 0) {
            return true;
        }
        return false;
    }

    public static void task7 (String y) {
        System.out.println("Привет," + y);
    }

}


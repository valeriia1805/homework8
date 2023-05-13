import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
        public static void task1() {
        System.out.println("Задача 1");
            int[] a = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;

            double[] b = new double[3];
            b[0] = 1.57;
            b[1] = 7.654;
            b[2] = 9.986;
            double[] otherB = {1.57, 7.654, 9.986};

            int[] c = new int[5];
            c[0] = 10;
            c[1] = 20;
            c[2] = 30;
            c[3] = 40;
            c[4] = 50;
        }
        public static void task2() {
            System.out.println("Задача 2");
            int[] a = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            for (int i = 0; i < 3; i++) {
                System.out.print(a[i]);
                if (i != 3 - 1)
                    System.out.print(",");
            }
            System.out.println();
            double[] otherB = {1.57, 7.654, 9.986};
            for (int i = 0; i < otherB.length; i++) {
                System.out.print(otherB[i]);
                if (i != otherB.length - 1)
                    System.out.print(",");
           }
            System.out.println( );
            int[] c = {10,20,30,40,50};
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
                if (i != c.length - 1)
                    System.out.print(",");
            }
            System.out.println();
}
        public static void task3() {
        System.out.println("Задача 3");
            int[] a = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            for (int i = 3-1; i >= 0; i--) {
                System.out.print(a[i]);
                if (i != 0)
                    System.out.print(",");
            }
            System.out.println();
            double[] otherB = {1.57, 7.654, 9.986};
            for (int i = otherB.length - 1; i >= 0; i--) {
                System.out.print(otherB[i]);
                if (i != 0)
                    System.out.print(",");
            }
            System.out.println( );
            int[] c = {10,20,30,40,50};
            for (int i = c.length-1; i >=0; i--) {
                System.out.print(c[i]);
                if (i != 0)
                    System.out.print(",");
            }
            System.out.println();
}
        public static void task4() {
        System.out.println("Задача 4");
            int[] a = { 1,2,3 };
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0){
                a[i] += 1;
                }
            }
            System.out.println(Arrays.toString(a));
        }
}




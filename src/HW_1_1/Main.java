package HW_1_1;

public class Main {
    //1.объявляем метод
    public static void main(String[] args) {
        //2.создаем переменные и инициализируем
        byte bt = 1;
        short sh = 10;
        int in = 100;
        long lg = 1000L;
        float fl = 3.14f;
        double dob = 6.28;
        char ch = 'X';
        boolean bln = false;
    }

    //3.вычисляем a*(b+(c/d)) и возвращаем результат
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //4.метод, определяющий нахождение числа в пределах от 10 до 20 включительно
    public static boolean task10and20(int x1, int x2) {
        int x3 = x1 + x2;
        if (x3 >= 10 && x3 <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //5.метод определени положительное число или отрицательное
    public static void isPositiveOrNegative(int x) {
        if (0 > x) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }

    //6.Метод определения число положительное или отрицательное с возвратом логическогозначения
    public static boolean isNegative(int x) {
        if (x <= 0) {
            return true;
        }
        else {
           return false;
        }
    }
    //7.Метод вывода сообщения с именем
    public static void greetings(String name) {
       System.out.println("Привет, " + name);
    }
    //8*
    public static void isLeapYear(int year) {
       if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
            System.out.println("Это високосный год");
        } else {
         System.out.println("Это не високосный год");
       }
    }

}
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static Serializable main(String[] args) {
        Scanner sc +new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("ведите второе число");
        int b = sc.nextInt();
        System.out.println("Введите операцию (+, -, *, /)");

        if (operation == '+') {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        if (operation == '-') {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }
        if (operation == '*') {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        if (operation == '/') {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
        private static String convertNumToRoman ( int numArabian)String[] roman;
        {
            roman = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };
            final String s = roman[numArabian];
            return s;
        }


        private static int romanToNumber (String roman){
            try {
                if (roman.equals("I")) {
                    return 1;
                } else if (roman.equals("II")) {
                    return 2;
                } else if (roman.equals("III")) {
                    return 3;
                } else if (roman.equals("IV")) {
                    return 4;
                } else if (roman.equals("V")) {
                    return 5;
                } else if (roman.equals("VI")) {
                    return 6;
                } else if (roman.equals("VII")) {
                    return 7;
                } else if (roman.equals("VIII")) {
                    return 8;
                } else if (roman.equals("IX")) {
                    return 9;
                } else if (roman.equals("X")) {
                    return 10;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Неверный формат данных");
            }
            return -1;
        }
        public static int calculated ( int num1, int num2, char op){
            int result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    try {
                        result = num1 / num2;
                    } catch (ArithmeticException | InputMismatchException e) {
                        System.out.println("Exception : " + e);
                        System.out.println("Only integer non-zero parameters allowed");

                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Не верный знак операции");
            }
            return result;
        }
    }
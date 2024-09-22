import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                //1
                System.out.println("\nНаходим максимальное число.");
                System.out.print("Введите первое число: ");
                int num1 = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int num2 = scanner.nextInt();
                System.out.println("Максимум: " + get_max(num1, num2));

                //2
                System.out.println("\nКалькулятор деления.");
                System.out.print("Введите первое число: ");
                double number1 = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double number2 = scanner.nextDouble();
                System.out.println("Результат: " + divide(number1, number2));

                //3
                System.out.println("\nПреобразование строки в число.");
                System.out.print("Введите строку: ");
                String str = scanner.next();
                System.out.println("Преобразованное число: " + string_to_number(str));

                //4
                System.out.println("\nПроверка возраста.");
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();
                System.out.println("Возраст: " + verify_age(age));

                //5
                System.out.println("\nВычисление квадратного корня.");
                System.out.print("Введите число: ");
                double sqrtValue = scanner.nextDouble();
                System.out.println("Результат: " + calculate_sqrt(sqrtValue));

                //6
                System.out.println("\nРасчет факториала.");
                System.out.print("Введите число: ");
                int factorialNumber = scanner.nextInt();
                System.out.println("Факториал: " + factorial(factorialNumber));

                //7
                System.out.println("\nПроверка массива на наличие нулей.");
                int[] arr = {3, 0, 12, 9, 0, 27, 0, 8};
                check_for_zero(arr);

                //8
                System.out.println("\nВозведение числа в степень.");
                System.out.print("Введите число: ");
                double base = scanner.nextDouble();
                System.out.print("Введите степень: ");
                int exponent = scanner.nextInt();
                System.out.println("Результат: " + power(base, exponent));

                //9
                System.out.println("\nОбрезка строки.");
                scanner.nextLine(); // consume newline
                System.out.print("Введите строку: ");
                String inputStr = scanner.nextLine();
                System.out.print("Сколько символов оставить: ");
                int length = scanner.nextInt();
                System.out.println("Обрезанная строка: " + trim_string(inputStr, length));

                //10
                System.out.println("\nПоиск числа в массиве.");
                int[] numbers = {12, 34, 56, 78, 90, 3, 45, 67};
                System.out.print("Введите число для поиска: ");
                int searchNum = scanner.nextInt();
                System.out.println("Число найдено на позиции: " + find_in_array(numbers, searchNum));

                //11
                System.out.println("\nКонвертация числа в двоичную систему.");
                System.out.print("Введите число: ");
                int toBinary = scanner.nextInt();
                System.out.println("Бинарное представление: " + tobinary_string(toBinary));

                //12
                System.out.println("\nПроверка делимости.");
                System.out.print("Введите первое число: ");
                double divisible1 = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double divisible2 = scanner.nextDouble();
                System.out.println("Частное: " + check_divisibility(divisible1, divisible2));

                //13
                System.out.println("\nПолучение элемента списка.");
                List<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
                System.out.print("Введите индекс: ");
                int index = scanner.nextInt();
                System.out.println("Элемент: " + get_element(list, index));

                //14
                System.out.println("\nПроверка пароля.");
                System.out.print("Введите пароль (должен содержать более 8 символов): ");
                String password = scanner.next();
                System.out.println("Проверка: " + validate_password(password));

                //15
                System.out.println("\nПроверка формата даты.");
                System.out.print("Введите дату (в формате ДД.ММ.ГГГГ): ");
                String inputDate = scanner.next();
                validate_date(inputDate);

                //16
                System.out.println("\nОбъединение строк.");
                System.out.print("Введите первую строку: ");
                String firstString = scanner.next();
                System.out.print("Введите вторую строку: ");
                String secondString = scanner.next();
                System.out.println("Результат: " + concatenate(firstString, secondString));

                //17
                System.out.println("\nВычисление остатка от деления.");
                System.out.print("Введите делимое: ");
                double dividend = scanner.nextDouble();
                System.out.print("Введите делитель: ");
                double divisor = scanner.nextDouble();
                System.out.println("Остаток: " + remainder(dividend, divisor));

                //18
                System.out.println("\nПроверка на квадратный корень.");
                System.out.print("Введите число: ");
                double sqrtNum = scanner.nextDouble();
                System.out.println("Результат: " + checkSqrt(sqrtNum));

                //19
                System.out.println("\nПреобразование температуры.");
                System.out.print("Введите температуру в Цельсиях: ");
                double celsius = scanner.nextDouble();
                System.out.println("В Фаренгейтах: " + celsius_to_fahrenheit(celsius));

                //20
                System.out.println("\nПроверка строки.");
                System.out.print("Введите строку: ");
                String checkStr = scanner.next();
                validate_string(checkStr);

            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static int get_max(int a, int b) throws Exception {
        if (a == b) throw new Exception("Числа равны, максимум не найден.");
        return Math.max(a, b);
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Деление на ноль недопустимо.");
        return a / b;
    }

    public static int string_to_number(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Не удалось преобразовать строку в число.");
        }
    }

    public static int verify_age(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) throw new IllegalArgumentException("Некорректный возраст.");
        return age;
    }

    public static double calculate_sqrt(double a) throws IllegalArgumentException {
        if (a < 0) throw new IllegalArgumentException("Отрицательное число.");
        return Math.sqrt(a);
    }

    public static int factorial(int a) throws IllegalArgumentException {
        if (a < 0) throw new IllegalArgumentException("Число должно быть неотрицательным.");
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static void check_for_zero(int[] arr) throws Exception {
        for (int num : arr) {
            if (num == 0) throw new Exception("Массив содержит нули.");
        }
    }

    public static double power(double base, int exp) throws IllegalArgumentException {
        if (exp < 0) throw new IllegalArgumentException("Степень должна быть неотрицательной.");
        return Math.pow(base, exp);
    }

    public static String trim_string(String str, int len) throws Exception {
        if (len > str.length()) throw new Exception("Длина обрезки больше длины строки.");
        return str.substring(0, len);
    }

    public static int find_in_array(int[] arr, int num) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        throw new Exception("Число не найдено.");
    }

    public static String tobinary_string(int num) {
        return Integer.toBinaryString(num);
    }

    public static double check_divisibility(double a, double b) throws IllegalArgumentException {
        if (b == 0) throw new IllegalArgumentException("Деление на ноль.");
        return a / b;
    }

    public static int get_element(List<Integer> list, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= list.size()) throw new IndexOutOfBoundsException("Неверный индекс.");
        return list.get(index);
    }

    public static String validate_password(String password) throws IllegalArgumentException {
        if (password.length() < 8) throw new IllegalArgumentException("Пароль слишком короткий.");
        return "Пароль принят.";
    }

    public static void validate_date(String date) throws Exception {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) throw new Exception("Неверный формат даты.");
    }

    public static String concatenate(String str1, String str2) throws Exception {
        if (str1 == null || str2 == null) throw new Exception("Строка равна null.");
        return str1 + str2;
    }

    public static double remainder(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Деление на ноль.");
        return a % b;
    }

    public static double checkSqrt(double a) {
        if (a < 0) throw new ArithmeticException("Отрицательное число.");
        return Math.sqrt(a);
    }

    public static double celsius_to_fahrenheit(double celsius) {
        if (celsius < -273.15) throw new IllegalArgumentException("Температура ниже абсолютного нуля.");
        return celsius * 9 / 5 + 32;
    }

    public static void validate_string(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("Пустая строка.");
    }
}

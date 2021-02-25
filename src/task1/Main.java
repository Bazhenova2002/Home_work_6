// Здание №1
//1) Продемонстрировать работу перечисленных методов string:
//
//  charAt,     contains, endsWith, startsWith, equals,    equalsIgnoreCase,
//  format,    indexOf,   isEmpty, length, replace,  substring,
//  toLowerCase,   toUpperCase, trim
//  *valueOf
//  *split
package task1;

public class Main {
    public static void main(String[] args) {
        String s1 = "Коллекция";
        String s2 = "Если у вас есть какие то интересные предложения, обращайтесь!";
        String s3 = "Таким образом реализация намеченных плановых заданий позволяет оценить значение новых предложений.";
        String s4 = s3;
        String s5 = "КОЛЛЕКЦИЯ";
        String s6 = "Лекция";
        String s7 = "";
        String s8 = "Affect";
        String s9 = "     Всем привет!     ";
        String s10 = "Домашнее-задание-выполнено!";

        System.out.println("*** Метод charAt ***");
        charAT(s1);
        System.out.println();

        System.out.println("*** Метод contains ***");
        contains(s2);
        System.out.println();

        System.out.println("*** Метод endsWith ***");
        endsWith(s2);
        System.out.println();

        System.out.println("*** Метод startsWith ***");
        startsWith(s2);
        System.out.println();

        System.out.println("*** Метод equals ***");
        equals(s2, s3, s4);
        System.out.println();

        System.out.println("*** Метод equalsIgnoreCase ***");
        equalsIgnoreCase(s1, s5, s6);
        System.out.println();

        System.out.println("*** Метод format ***");
        System.out.format("Привет - %s! Как дела %s?\n", "Том", "на работе");
        System.out.format("Число ПИ равно -  %f...\n", 3.14159);
        System.out.println();

        System.out.println("*** Метод indexOf ***");
        indexOf(s2);
        System.out.println();

        System.out.println("*** Метод isEmpty ***");
        isEmpty(s1, s7);
        System.out.println();

        System.out.println("*** Метод length ***");
        lengthMetod(s2, s3);
        System.out.println();

        System.out.println("*** Метод replace ***");
        replace(s8);
        System.out.println();

        System.out.println("*** Метод substring ***");
        substring(s2);
        System.out.println();

        System.out.println("*** Метод toLowerCase ***");
        toLowerCase(s5);
        System.out.println();

        System.out.println("*** Метод toUpperCase ***");
        toUpperCase(s2);
        System.out.println();

        System.out.println("*** Метод trim ***");
        trim(s9);
        System.out.println();

        System.out.println("*** Метод valueOf ***");
        String d = String.valueOf(12.0D);
        System.out.println(d);
        System.out.println();

        System.out.println("*** Метод split ***");
        split(s10, s2);
    }

    private static void split(String s, String s1) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + s + "\"");
        System.out.println("-----------------------------------------------------------------");
        for (String testSplit : s.split("-")) {
            System.out.println(testSplit);
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + s1 + "\"");
        System.out.println("-----------------------------------------------------------------");
        for (String testSplit : s1.split(" ")) {
            System.out.println(testSplit);
        }
    }


    private static void trim(String s) {
        System.out.println(s);
        System.out.println(s.trim());
    }

    private static void toUpperCase(String s) {
        System.out.println(s);
        System.out.println("Измененная строка: " + s.toUpperCase());
    }

    private static void toLowerCase(String s) {
        System.out.println(s);
        System.out.println("Изменное слово: " + s.toLowerCase());
    }

    private static void substring(String s) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + s + "\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Измененная строка: " + s.substring(25));
        System.out.println("Измененная строка: " + s.substring(36, 47));
    }

    private static void replace(String s) {
        String newS = s.replace('A', 'E');
        System.out.println("Старое слово: " + s);
        System.out.println("Новое слово: " + newS);
    }

    private static void lengthMetod(String s1, String s2) {
        System.out.println("Длина строки \"Если у вас есть какие то интересные предложения, обращайтесь!\" - " + s1.length());
        System.out.println("Длина строки \"Таким образом реализация намеченных плановых заданий позволяет оценить значение новых предложений.\" - " + s2.length());
    }

    private static void isEmpty(String s1, String s7) {
        if (s1.length() == 0 || s1.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            System.out.println(s1);
        }
        if (s7.length() == 0 || s7.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            System.out.println(s7);
        }
    }

    private static void indexOf(String s) {
        System.out.println("\"" + s + "\"");
        int value = s.indexOf(33, 0);
        System.out.println("Восклицательный знак в данной строке символ под номером: " + value);
    }

    private static void equalsIgnoreCase(String s1, String s2, String s3) {
        System.out.println("-------------------------");
        System.out.println("Первое слово: " + s1);
        System.out.println("-------------------------");
        System.out.println("Второе слово: " + s2);
        System.out.println("-------------------------");
        System.out.println("Третье слово: " + s3);
        System.out.println("-------------------------");
        System.out.println();
        boolean returnValue;
        returnValue = s1.equalsIgnoreCase(s2);
        System.out.println("Первое слово равно второму? : " + returnValue);
        returnValue = s1.equalsIgnoreCase(s3);
        System.out.println("Первое слово равно третьему? : " + returnValue);
    }

    private static void equals(String s1, String s2, String s3) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Первая строка: \"" + s1 + "\"");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Вторая строка: \"" + s2 + "\"");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Третья строка: \"" + s2 + "\"");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        boolean returnValue;
        returnValue = s1.equals(s2);
        System.out.println("Первая строка равна второй строке? : " + returnValue);
        returnValue = s2.equals(s3);
        System.out.println("Вторая строка равна третьей строке? : " + returnValue);
    }

    private static void startsWith(String s) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + s + "\"");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Строка начинается с: 'Если у вас'. : " + s.startsWith("Если у вас"));
        System.out.println("Строка начинается с: 'У вас'. : " + s.startsWith("у вас"));
        System.out.println("Строка начинается с: 'Если у вас'. : " + s.startsWith("Если у вас", 0));
    }

    private static void endsWith(String s) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + s + "\"");
        System.out.println("-----------------------------------------------------------------");
        boolean returnWord;
        returnWord = s.endsWith("обращайтесь!");
        System.out.println("Строка заканчивается на 'обращайтесь!'. - " + returnWord);

        returnWord = s.endsWith("обращайтесь к нам!");
        System.out.println("Строка заканчивается на 'обращайтесь к нам!'. - " + returnWord);
    }

    private static void contains(String s) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + s + "\"");
        System.out.println("-----------------------------------------------------------------");
        if (s.contains("предложения")) {
            System.out.println("Ключевое слово: 'предложения' - находится в данной строке");
        } else {
            System.out.println("Ключевое слово: 'предложения' - не найденно");
        }
    }

    private static void charAT(String s) {
        System.out.println(s);
        char ch1 = s.charAt(3);
        char ch2 = s.charAt(4);
        char ch3 = s.charAt(5);
        char ch4 = s.charAt(6);
        char ch5 = s.charAt(7);
        char ch6 = s.charAt(8);
        System.out.print("Изменённое слово: " + ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4);
        System.out.print(ch5);
        System.out.print(ch6 + "\n");
    }
}

package javaBasics;

import java.lang.reflect.Method;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /* Это многострочный комментари
        он нужен для того, что бы описывать действия методов
        */
        System.out.println("Hello World!"); // <-Statements - Инструкция
        //Инструкции разделяются при помощи символа ";"
        /*В Java арифметические операции бывыают коммутативные (Если от перемены мест операнд
        результат не меняется
        */
        System.out.println(0.2 + 0.1 + "\nТакое поведение обуславливается ограничениями вычислительных мощностей\n" +
                "операции с плавающими числами неточны");

        var a = "Витя";
        /* a = 2; <- Так не выйдет!
        Java — статически типизированный язык
        Присвоив переменной символ, потом менять на цифру - не получится
         */
        a = "Вася";

        //Константы обозначаются модификатором final
        final var pi = 3.14;
        System.out.println(pi);

        var correctName = "Имя переменной должно быть понятно!";
        System.out.println(correctName);

        var age = "22"; //String

        System.out.println(age + "\n");
        System.out.println("\nЛюбой ссылочный тип данных может принимать значение null." +
                "То есть, null является значением любого ссылочного типа. А вот примитивные типы и null не совместимы." +
                "Примитивное значение всегда должно быть определено:");

        String mom = "Мама купила 10 яиц";
        String eg = "";
        int egg;
        for (int i = 0; i < mom.length(); i++) {
            if (!Character.isDigit(mom.charAt(i))) {
                continue;
            }
            eg = (eg + mom.charAt(i));
        }
        egg = Integer.parseInt(eg);
        System.out.println(egg);
        System.out.println("\nА еще можно приводить типы из примитивного в примитивны так: (int) 5.1");
        System.out.println((int) 2.9 + " times\n");
        System.out.println("А теперь выбери номер урока, который хочещшь прочитать, от 8 до 29");
        Scanner scanner = new Scanner(System.in);
        var inputInt = scanner.nextInt();
        scanner.close();
        String methodName = "lesson" + inputInt;
        try {
            Class<?> clazz = App.class;
            Method method = clazz.getMethod(methodName);
            method.invoke(null);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    public static void lesson8 () {
        System.out.println("Всего в Java восемь примитивных типов данных:\n" +
                "byte — занимает в памяти 1 байт, значит может хранить числа от -128 до 127\n" +
                "short — занимает в памяти 2 байта\n" +
                "int — занимает в памяти 4 байта\n" +
                "long — занимает в памяти 8 байт\n" +
                "float — отвечают за рациональные\n" +
                "double — отвечают за рациональные\n" +
                "boolean отвечает за логические значения true и false\n" +
                "char — символ. Это не строка, у него другой способ определения — через одиночные кавычки.");
    };

    public static void lesson9() {
        System.out.println("Методы вызываются так: company.toUpperCase(); // \"HEXLET\"");
    };

    public static void lesson10() {
        System.out.println("Бывают ошибки:" +
                "\n Синтаксические - Примером может быть забытая ;." +
                "\n Ошибки типов - var value = \"hexlet\" * 42;" +
                "\n Вызывается метод которого не существует у данного типа.\n" +
                "\n" +
                "Метод tryme() не существует у строк\n" +
                "\"hexlet\".tryme(); // Error!\n" +
                "Метод вызывается с аргументами, которые не соответствуют ожидаемым типам.\n" +
                "\n" +
                "charAt ожидает на вход число\n" +
                "\"hexlet\".charAt(\"5\"); // Error!\n" +
                "Количество аргументов не совпадает с ожидаемым\n" +
                "\n" +
                "У метода только один параметр\n" +
                "\"hexlet\".charAt(5, 10); // Error!\n" +
                "Используется неверный тип значения или переменной\n" +
                "\n" +
                "Строке нельзя присвоить число\n" +
                "String value = 10;\n" +
                "// Числу нельзя присвоить строку\n" +
                "int value = \"hexlet\";" +
                "\n Ошибки выполнения - var x = 0;\n" +
                "var value = 3 / x;" +
                "\n Логические ошибки - Самые сложные ошибки, которые не приводят к остановке программы." +
                "\nТо есть программа работает, но ее результат не соответствует ожидаемому." +
                "\n Ошибки линтера - Они проверяют код на соответствие стандартам. В Java это checkstyle.");
    };
//11 урок
}

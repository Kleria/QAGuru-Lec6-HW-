package ru.kleria;
public class FirstJavaLesson {
    public static void main(String[] args) {
        //Арифметические операторы
        byte a = 56;
        byte b = -45;
        byte c = 8;
        byte d = 2;
        byte sumResult = (byte) (a + b);
        System.out.println("Сложение: " + sumResult);
        byte substractionResult = (byte) (a - b);
        System.out.println("Вычитание: " + substractionResult);
        byte multiplicatuionResult = (byte) (a * b);
        System.out.println("Умножение в byte: " + multiplicatuionResult);
        int multiplicatuionResult2 = (a * b);
        System.out.println("Умножение в int: " + multiplicatuionResult2);
        byte divisionResult = (byte) (c / d);
        System.out.println("Деление:" + divisionResult);
        System.out.println("Остаток по модулю:" + 7 % 2);
        //Сравнения
        System.out.println (a == b);
        System.out.println (a >= b);
        System.out.println (c != b);
        // Логические + ifelse
        byte age = 34;
        int income = 35000;
        int job = 2;
        if (age <= 65 && age >= 18 && income >= 45000)
        {
            System.out.println("Вам одобрен кредит!");
        }
        else
        {if  (job >0)
            System.out.println("Думайте денежно, что ж вы так то");
        else
        {
            System.out.println("Вам не одобрен кредит!");
        }
        }
    }
}

package Function;

public class Task2
{
    public static void main(String[] args) {
        System.out.print("Задание 2 ");
        System.out.println(numberToText(666));
    }

    // Вводим число (0-999), получаем строку с прописью числа.

    public static String numberToText(int number)
    {
        String words = "";

        if (number < 0)
            words = "Minus " + numberToText(-number);
        else if (number == 0)
            words = "";
        else if (number <= 19)
            words = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                    "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"}[number - 1] + " ";
        else if (number  <= 99)
            words = new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                    "Eighty", "Ninety"}[number / 10 - 2] + " " + numberToText(number % 10);
        else if (number <= 199)
            words = "One Hundred " + numberToText(number % 100);
        else if (number <= 999)
            words = numberToText(number / 100) + "Hundreds " + numberToText(number % 100);

        return words;
    }


}
public class Task3 {
    public static void main(String[] args) {
        System.out.print("Задание 5");
        System.out.println(NumberToText2( 9999999));
    }


    public static String NumberToText2(int number)
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
        else if (number <= 199) {
            words = "One Hundred " + numberToText(number % 100);
        } else if (number <= 999)
            words = numberToText(number / 100) + "Hundreds " + numberToText(number % 100);
        else if (number <= 1999)
            words = "One Thousand " + numberToText(number % 1000);
        else if (number <= 999999)
            words = numberToText(number / 1000) + "Thousands " + numberToText(number % 1000);
        else if (number <= 1999999)
            words = "One Million " + numberToText(number % 1000000);
        else if (number <= 999999999)
            words = numberToText(number / 1000000) + "Millions " + numberToText(number % 1000000);
        else if (number <= 1999999999)
            words = "One Billion " + numberToText(number % 1000000000);
        else
            words = numberToText(number / 1000000000) + "Billions " + numberToText(number % 1000000000);

        return words;
    }




}
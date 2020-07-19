public class Function {



    // Получить строковое название дня недели по номеру дня
    public static void DayOfNumber(int numbers){

        if (numbers<0 && numbers>7)
        {
            System.out.print("NOT FOUND");
        }
        switch(numbers)
        {
            case 1:
                System.out.print("понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("Среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресенье");
                break;
        }

    }

    // Вводим число (0-999), получаем строку с прописью числа.

    public static String NumberToText(int number)
    {
        String words = "";

        if (number < 0)
            words = "Minus " + NumberToText(-number);
        else if (number == 0)
            words = "";
        else if (number <= 19)
            words = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                    "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"}[number - 1] + " ";
        else if (number  <= 99)
            words = new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                    "Eighty", "Ninety"}[number / 10 - 2] + " " + NumberToText(number % 10);
        else if (number <= 199)
            words = "One Hundred " + NumberToText(number % 100);
        else if (number <= 999)
            words = NumberToText(number / 100) + "Hundreds " + NumberToText(number % 100);

        return words;
    }

    // Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число  / Для задания 3 расширить диапазон до 999 миллиардов

    public static long StringToNumber(String str)
    {
        String arr[] = str.split(" ");
        String result = "";

        String[] FromOneToNineteen = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] FromTenToNinety = new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                "Eighty", "Ninety"};

        for(String s : arr)
        {
            for(int i = 0; i < FromOneToNineteen.length; i++){
                if(s.equals(FromOneToNineteen[i]))
                    result += i + 1;
            }
            for(int i = 0; i < FromTenToNinety.length; i++){
                if(s.equals(FromTenToNinety[i]))
                    result += (i + 2) * 10;
            }

            if(s.equals("Hundred") || s.equals("Hundreds"))
                result += "00";
            else if(s.equals("Thousand") || s.equals("Thousands"))
                result += "000";
            else if(s.equals("Million") || s.equals("Millions"))
                result += "000000";
            else if(s.equals("Billion") || s.equals("Billions"))
                result += "000000000";
        }

        return Long.parseLong(result);
    }

    //  Найти расстояние между двумя точками в двумерном декартовом пространстве.

    public static double calculateDistanceBetweenPoints(int x1,int y1,int x2,int y2)
    {
        double result = (double) Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
        return result;
    }

    // Для задания 2 расширить диапазон до 999 миллиардов

    public static String NumberToText2(int number)
    {
        String words = "";

        if (number < 0)
            words = "Minus " + NumberToText(-number);
        else if (number == 0)
            words = "";
        else if (number <= 19)
            words = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                    "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                    "Seventeen", "Eighteen", "Nineteen"}[number - 1] + " ";
        else if (number  <= 99)
            words = new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                    "Eighty", "Ninety"}[number / 10 - 2] + " " + NumberToText(number % 10);
        else if (number <= 199) {
            words = "One Hundred " + NumberToText(number % 100);
        } else if (number <= 999)
            words = NumberToText(number / 100) + "Hundreds " + NumberToText(number % 100);
        else if (number <= 1999)
            words = "One Thousand " + NumberToText(number % 1000);
        else if (number <= 999999)
            words = NumberToText(number / 1000) + "Thousands " + NumberToText(number % 1000);
        else if (number <= 1999999)
            words = "One Million " + NumberToText(number % 1000000);
        else if (number <= 999999999)
            words = NumberToText(number / 1000000) + "Millions " + NumberToText(number % 1000000);
        else if (number <= 1999999999)
            words = "One Billion " + NumberToText(number % 1000000000);
        else
            words = NumberToText(number / 1000000000) + "Billions " + NumberToText(number % 1000000000);

        return words;
    }








}
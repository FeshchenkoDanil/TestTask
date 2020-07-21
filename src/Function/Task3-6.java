package Function;

public class Task3
{
    public static void main(String[] args) {
        System.out.print("Задание 3 , 6 ");
        System.out.println(stringToNumber(" Nine billion  "));
    }

    // Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число  / Для задания 3 расширить диапазон до 999 миллиардов

    public static long stringToNumber(String str)
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




}
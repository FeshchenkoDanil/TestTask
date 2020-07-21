package Function;

public class Task1
{
    public static void main(String[] args) {
        System.out.print("Задание 1 ");
        System.out.println(dayOfNumber(3););
    }

    public static void dayOfNumber(int numbers){

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


}
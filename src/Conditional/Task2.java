package Conditional;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Задание 2 ");
        System.out.println(findQuarter(1,2));
    }
    // Определить какой четверти принадлежит точка с координатами (х,у)
    public static String findQuarter(int x, int y)
    {
        String result="";

        if(x >= 0)
        {
            if (y >=0 )
            {
                result = "Point belongs to 1 quarter";
            } else{
                result = "Point belongs to 4 quarter";
            }
        }

        if(x<= 0)
        {
            if (y>=0 )
            {
                result = "Point belongs to 2 quarter";
            } else{
                result = "Point belongs to 3 quarter";
            }
        }
        return result;
    }

}
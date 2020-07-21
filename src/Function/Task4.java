public class Task4{
    public static void main(String[] args) {
        System.out.print("Задание 4 ");
        System.out.println(calculateDistanceBetweenPoints(15,15,10,10));
    }

    //  Найти расстояние между двумя точками в двумерном декартовом пространстве.

    public static double calculateDistanceBetweenPoints(int x1,int y1,int x2,int y2)
    {
        double result = (double) Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
        return result;
    }

}
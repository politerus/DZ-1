package Zavdannya2;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Введите  длину и нажмите Enter");
        Scanner dlina =new Scanner(System.in);
        double side1 = dlina.nextDouble();
        System.out.println("Введите  Ширину и нажмите Enter");
        Scanner shirina =new Scanner(System.in);
         double side2 = shirina.nextDouble();
Rectangle.areaCalculator( side1,side2);
Rectangle.perimeterCalculator(side1,side2);
    };
public static double areaCalculator(double side1,double side2){
    double s= 0;
    System.out.println("Площадь прямоугольника равна: "+(s=side1*side2));
return s;

};
public static double perimeterCalculator (double side1, double side2){
double p= 0;
    System.out.println("Периметр  прямоугольника равен: "+(p=2*(side1+side2)));
return p;

}
}

/*   Используя IDEA, создайте проект с пакетом. Требуется:
        Создать класс с именем Rectangle. В теле класса создать два поля,
        описывающие длины сторон double side1, double side2. Создать два метода,
        вычисляющих площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
        прямоугольника – double perimeterCalculator (double side1, double side2). Написать приложение,
        которое принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр
        и площадь.*/
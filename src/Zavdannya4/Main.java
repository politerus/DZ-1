package Zavdannya4;

public class Main {
    public static void main(String[] args) {
        Computers[] comp = new Computers [5];

        for (int i = 0; i < 5; i++){

            comp[i] = new Computers(0 + (i + 1));
System.out.println(comp.length);
        }
    }
}//Дуже не зрозуміле завдання!
   /* Використовуючи IDEA, створіть проект із пакетом.
   Створити клас Computer,створити масив об'єктів Computers розміром 5.
    Далі руками створити 5 екземплярів цього класу та записати
    на комп'ютер (використовуючи loop).*/
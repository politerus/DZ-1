package Zavdannya3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  Book book1 = new Book();
         Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть автора книги :");
        book1.nameAuthor.author= scanner.nextLine();

        System.out.println("Введіть назву книги :");
        book1.nazvaTitle.Title=scanner.nextLine();

        System.out.println("Введіть зміст книги :");
        book1.textContent.Content=scanner.nextLine();


        book1.nameAuthor.show();
        book1.nazvaTitle.show();
        book1.textContent.show();*/

        Book book2 = new Book();
        book2.nameAuthor.author ="Шевченко Тарас Григорович";
        book2.nazvaTitle.Title = "Кобзар";
        book2.textContent.Content="По діброві вітер виє,\n" +
                "Гуляє по полю,\n" +
                "Край дороги гне тополю\n" +
                "До самого долу.";
        book2.nameAuthor.show();
        book2.nazvaTitle.show();
        book2.textContent.show();
    }
}
 /*      Використовуючи IDEA, створіть проект із пакетом. Потрібно:
        Створити клас Book (Main). Створити класи Title, Author та Content, кожен з яких повинен містити
        одне рядкове поле та метод void show(). Реалізуйте можливість додавання до книги назви книги,
        імені автора та змісту. Виведіть на екран за допомогою методу show() назву книги,
        ім'я автора та Зміст.*/
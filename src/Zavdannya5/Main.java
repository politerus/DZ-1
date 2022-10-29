package Zavdannya5;

public class Main {
    public static void main(String[] args) {
Address index =new Address();
Address country =new Address();
Address city =new Address();
Address street =new Address();
Address house =new Address();
Address apartment =new Address();

index.setIndex(6100);
index.getIndex();
country.setCountry("Украіна");
country.getCountry();
city.setCity("Харків");
city.getCity();
street.setStreet("Сочинскька");
street.getStreet();
house.setHouse(17);
house.getHouse();
apartment.setApartment(12);
apartment.getApartment();
System.out.println("Ваш  Адррес проживания таков!");
System.out.println("Индекс-"+index.getIndex()+";"+" Страна-"+country.getCountry()+";"+
        " Город-"+ city.getCity()+";"+" Улица-"+street.getStreet()+";"+" Дом-"+house.getHouse()+";"+
        " Квартира-"+ apartment.getApartment());
}

}
/*Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Address.
        У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
        Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
        У поля екземпляра записати інформацію про поштову адресу. Виведіть на екран значення полів,
        що описують адресу.*/
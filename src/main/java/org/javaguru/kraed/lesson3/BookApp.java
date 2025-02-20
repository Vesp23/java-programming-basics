package org.javaguru.kraed.lesson3;

public class BookApp {
    public static void main(String[] args) {

        Chapter chapter11 = new Chapter("1First", "aoaoaoaoaoa");
        Chapter chapter12 = new Chapter("1Second", "bobobobobob");
        Chapter chapter21 = new Chapter("2First", "cococococc");
        Chapter chapter22 = new Chapter("2Second", "Dodododododo");

        Book book1 = new Book("Gogo", 1986, "Liza",chapter11,chapter12);
        Book book2 = new Book("Jojo", 1910, "Ivan",chapter21,chapter22);

        System.out.println("Первая книга - " + book1.getName());
        System.out.println("Автор - " + book1.getAuthor());
        System.out.println("Год выпуска - " + book1.getYear());
        System.out.println("Первая глава - " + book1.getChapter1().getName() + " текст: " + book1.getChapter1().getText());
        System.out.println("Вторая глава - " + book1.getChapter2().getName() + " текст: " + book1.getChapter2().getText());
    }
}

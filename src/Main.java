public class Main {
    public static void main(String[] args) {
        //First homework Objects
        System.out.println("First homework Objects");
        Author author1 = new Author("А.С. Пушкин");
        Author author2 = new Author("Ф.М. Достоевский");
        Book book1 = new Book("Сказка о царе Салтане", author1, 1980);
        Book book2 = new Book("Преступление и наказание", author2, 1990);
        System.out.println("book2.getPublicationYear() = " + book2.getPublicationYear());
        book2.setPublicationYear(1998);
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getAuthor().getFullName() = " + book1.getAuthor().getFullName());
        System.out.println("book1.getPublicationYear() = " + book1.getPublicationYear());
        System.out.println("book2.getTitle() = " + book2.getTitle());
        System.out.println("book2.getAuthor().getFullName() = " + book2.getAuthor().getFullName());
        System.out.println("book2.getPublicationYear() = " + book2.getPublicationYear());


        //Second homework Objects
        System.out.println("Second homework Objects");
        System.out.println(book1);
        System.out.println(book2);
        Author author3 = new Author("Ф.М. Достоевский");
        Book book3 = new Book("Преступление и наказание", author3, 1998);
        System.out.println(author3.equals(author2));
        System.out.println(author3.equals(author1));
        System.out.println(book3.equals(book1));
        System.out.println(book3.equals(book2));
    }
}

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Chuck", "Palahniuk");
        Author author2 = new Author("David", "Wong");
        Author author3 = new Author("Chuck", "Palahniuk");

        Book book1 = new Book("Fight club", author1, 1995);
        Book book2 = new Book("John dies in the end", author2, 2007);
        Book book3 = new Book("Fight club", author1, 1995);
        System.out.println(book1);
        System.out.println(book2);
        book1.setPublicationYear(1996);
        System.out.println(book1);
        System.out.println(author1.equals(author3));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
    }
}
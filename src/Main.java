public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Chuck", "Palahniuk");
        Author author2 = new Author("David", "Wong");

        Book book1 = new Book("Fight club", author1, 1995);
        Book book2 = new Book("John dies in the end", author2, 2007);
        System.out.println(book1);
        System.out.println(book2);
        book1.setPublicationYear(1996);
        System.out.println(book1);
    }
}
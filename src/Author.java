public class Author {
    private final String nameAuthor;
    private final String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getName() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surnameAuthor;
    }

    @Override
    public String toString() {
        return "Author [nameAuthor = " + getName()
                + ", surnameAuthor = " + getSurname() + "]";
    }
}

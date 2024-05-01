public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название книги - " + getTitle() +
                ", автор - " + author.toString() +
                ", год издания - " + getPublicationYear();
    }

    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return this.getTitle().equals(book.getTitle())
                && author.equals(book.getAuthor())
                && this.getPublicationYear() == book.getPublicationYear();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }
}

public class Author {
    private final String fullName;

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String toString() {
        return getFullName();
    }

    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Author author = (Author) object;
        return this.getFullName().equals(author.getFullName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName);
    }
}

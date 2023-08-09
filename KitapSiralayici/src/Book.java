public class Book implements Comparable<Book>{

    private String name;
    private int pageCount;
    private String author;
    private String creationDate;

    public Book(String name, int pageCount, String author, String creationDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.name.compareTo(otherBook.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}

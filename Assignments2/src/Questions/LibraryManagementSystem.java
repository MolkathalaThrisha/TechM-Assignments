package Questions;
import java.util.ArrayList;
import java.util.List;
class Book {
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}

class Member {
    private String memberId;
    private String name;
    private String contactInfo;

    public Member(String memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
}

class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void borrowBook(String bookId, String memberId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book borrowed successfully by member ID: " + memberId);
                return;
            }
        }
        System.out.println("Book is not available or does not exist.");
    }

    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book was not borrowed or does not exist.");
    }

    public List<Book> searchBookByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("B001", "Effective Java", "Joshua Bloch", "978-0134685991"));
        library.addBook(new Book("B002", "Clean Code", "Robert C. Martin", "978-0132350884"));
        library.registerMember(new Member("M001", "Alice Johnson", "alice@example.com"));
        library.registerMember(new Member("M002", "Bob Smith", "bob@example.com"));
        library.borrowBook("B001", "M001");
        library.returnBook("B001");
        List<Book> booksByTitle = library.searchBookByTitle("Clean Code");
        for (Book book : booksByTitle) {
            System.out.println("Found Book: " + book.getTitle() + " by " + book.getAuthor());
        }
        List<Book> booksByAuthor = library.searchBookByAuthor("Joshua Bloch");
        for (Book book : booksByAuthor) {
            System.out.println("Found Book: " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}

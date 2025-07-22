import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully.");
    }

    public void viewMembers() {
        for (Member m : members) {
            System.out.println(m);
        }
    }

    public void issueBook(String bookId, String memberId) {
        Book bookToIssue = null;
        for (Book b : books) {
            if (b.getId().equals(bookId) && !b.isIssued()) {
                bookToIssue = b;
                break;
            }
        }
        if (bookToIssue == null) {
            System.out.println("Book not available or already issued.");
            return;
        }
        bookToIssue.setIssued(true);
        System.out.println("Book issued to Member ID: " + memberId);
    }

    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.getId().equals(bookId) && b.isIssued()) {
                b.setIssued(false);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Register Member");
            System.out.println("4. View Members");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(id, title, author));
                    break;
                case 2:
                    lib.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Member ID: ");
                    String mid = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    lib.addMember(new Member(mid, name));
                    break;
                case 4:
                    lib.viewMembers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    lib.issueBook(bookId, memberId);
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = sc.nextLine();
                    lib.returnBook(returnId);
                    break;
                case 0:
                    System.out.println("Exiting system.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

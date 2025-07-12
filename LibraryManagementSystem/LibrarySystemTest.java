package Inheritance.LibraryManagementSystem;

public class LibrarySystemTest{
    public static void main(String args[]){
        LibraryBook lb1 = new LibraryBook("Atomic Habits", "James Clear", "978-0735211292");
        lb1.displayInfo();

        lb1.issueBook();

        lb1.displayInfo();

        lb1.returnBook();

        lb1.displayInfo();
    }
}

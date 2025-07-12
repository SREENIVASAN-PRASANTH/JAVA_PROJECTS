package Inheritance.LibraryManagementSystem;
import Inheritance.LibraryManagementSystem.Book;
import java.time.LocalDate;

public class LibraryBook extends Book{

    private boolean isIssued;
    private String dueDate;

    public LibraryBook(String author, String title, String ISBN){
        super(author, title, ISBN);
        this.isIssued = false;
        this.dueDate = null;
    }

    
    public boolean getIsIssued(){
        return isIssued;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public void issueBook(){
        System.out.println("Issueing Book");
        this.isIssued = true;
        this.dueDate = LocalDate.now().plusDays(10).toString();
    }

    public void returnBook(){
        System.out.println("returning Book");
        this.isIssued = false;
        this.dueDate = null;
    }

    @Override 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issued: " + getIsIssued());
        if(getIsIssued() == true){
            System.out.println("dueDate: " + getDueDate());
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

class Librarybook
{
    int maxF;
    int maxS;
    String bookname;
    String publisher;
    String author;
    Date issueDate;
    Date returnDate;
    Date addedBooks;
    int bookID;
    String studentName;
    String facultyName;
    int studentID;
    int facultyID;
    int isFaculty;
    int isStudent;
    int isIssue;
    double fine;
    public Librarybook()
    {
        maxF = 30;
        maxS = 15;
        bookname = "";
        publisher = "";
        author = "";
        issueDate = new Date();
        returnDate = new Date();
        addedBooks = new Date();
        bookID = 0;
        studentID = 0;
        facultyID = 0;
        studentName = "";
        facultyName = "";
        isFaculty = 0;
        isStudent = 0;
        isIssue = 0;
        fine = 0;
    }
    public Date getAddedBooks() {
        return addedBooks;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getBookID() {
        return bookID;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public int getIsFaculty() {
        return isFaculty;
    }

    public int getIsStudent() {
        return isStudent;
    }

    public int getMaxF() {
        return maxF;
    }

    public int getMaxS() {
        return maxS;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookname() {
        return bookname;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public double getFine() {
        return fine;
    }

    public int getIsIssue() {
        return isIssue;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setAddedBooks(Date addedBooks) {
        this.addedBooks = addedBooks;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setIsFaculty(int isFaculty) {
        this.isFaculty = isFaculty;
    }

    public void setIsStudent(int isStudent) {
        this.isStudent = isStudent;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public void setMaxF(int maxF) {
        this.maxF = maxF;
    }

    public void setMaxS(int maxS) {
        this.maxS = maxS;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public void setIsIssue(int isIssue) {
        this.isIssue = isIssue;
    }
}
class Librarian extends Librarybook
{
    void add(Test book)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter book ID: ");
        book.bookID = Integer.parseInt(in.readLine());
        System.out.println("Enter the name of the book: ");
        book.bookname = in.readLine();
        System.out.println("Enter publisher's name: ");
        book.publisher = in.readLine();
        System.out.println("Enter author's name: ");
        book.author = in.readLine();
        book.addedBooks = new Date();
    }
    void delete(Test book)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        book.bookname = "Empty";
        book.author = "empty";
        book.publisher = "empty";
        book.bookID = 0;
        book.maxF = 0;
        book.maxS = 0;
        book.isIssue = 0;
        book.isStudent = 0;
        book.isFaculty = 0;
        book.addedBooks = new Date();
    }
    void view(Test[] book, int No)
    {
        int i;
        System.out.println("ID\tName\t\tAuthor\tPublisher");
        for(i=0;i<No;i++)
        {
            if(!book[i].bookname.equals("empty"))
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher);
        }
    }
    void issue(Test book, int ch)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        if(ch == 1)
        {
            if(book.maxF < 10)
            {
                System.out.println("Enter faculty ID: ");
                book.facultyID = Integer.parseInt(in.readLine());
                System.out.println("Enter faculty name: ");
                book.facultyName = in.readLine();
                book.issueDate = new Date();
                book.isFaculty = 1;
                book.isStudent = 0;
                book.isIssue = 1;
                book.maxF += 1;
            }
            else
            {
                System.out.println("Sorry you cannot issue any further books! Please return a book to borrow this one.");
            }
        }
        else if(ch == 2)
        {
            if(book.maxS < 5)
            {
                System.out.println("Enter student ID: ");
                book.studentID = Integer.parseInt(in.readLine());
                System.out.println("Enter student name: ");
                book.studentName = in.readLine();
                book.issueDate = new Date();
                book.isFaculty = 0;
                book.isStudent = 1;
                book.isIssue = 1;
                book.maxS += 1;
            }
            else
            {
                System.out.println("Sorry you cannot issue any further books! Please return a book to borrow this one.");
            }
        }
        else
        {
            System.out.println("Wrong choice!");
        }
    }
    void returnBook(Test book, int ch)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        if(ch == 1)
        {
            //System.out.println("Enter faculty ID: ");
            book.facultyID = 0;
            //System.out.println("Enter faculty name: ");
            book.facultyName = "empty";
            book.returnDate = new Date();
            book.isFaculty = 0;
            book.isStudent = 0;
            book.isIssue = 0;
            book.maxF = 0;
            book.fine = 0;
            book.maxS = 0;
        }
        else if(ch == 2)
        {

            //System.out.println("Enter student ID: ");
            book.studentID = 0;
            //System.out.println("Enter student name: ");
            book.studentName = "empty";
            book.issueDate = new Date();
            book.isFaculty = 0;
            book.isStudent = 1;
            book.isIssue = 1;
            book.maxS += 1;

        }
        else
        {
            System.out.println("Wrong choice!");
        }
    }
    void viewIssue(Test[] book, int No)
    {
        int i;
        Date temp = new Date();
        System.out.println("ID\tName\t\tAuthor\tPublisher\tIssue Date\tIssued to\tDelay");
        for(i=0;i<No;i++)
        {
            long diff = temp.getTime() - book[i].issueDate.getTime();
            int diffInDays = (int) ((diff) / (1000 * 60 * 60 * 24));
            if(book[i].isIssue == 1 && book[i].isStudent == 1 && !book[i].bookname.equals("empty"))
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher+"\t"+book[i].issueDate+"\t"+book[i].studentName+"\t"+diffInDays);
            else if(book[i].isIssue == 1 && book[i].isFaculty == 1 && !book[i].bookname.equals("empty"))
            {
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher+"\t"+book[i].issueDate+"\t"+book[i].facultyName+"\t"+diffInDays);
            }
        }
    }
    void remind(Test[] book, int No)
    {
        int i;
        Date temp = new Date();
        System.out.println("ID\tBook Name\t\tAuthor\tPublisher\tStudent Name\tFine\tDelay");
        for(i=0;i<No;i++)
        {
            // compare dates
            long diff = temp.getTime() - book[i].issueDate.getTime();
            int diffInDays = (int) ((diff) / (1000 * 60 * 60 * 24));
            if(diffInDays > 1 && diffInDays <= 7 && book[i].isStudent == 1 && !book[i].bookname.equals("empty"))
            {
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher+"\t"+book[i].studentName+"\t"+book[i].fine+"\t"+diffInDays);
            }
        }
        System.out.println("ID\tBook Name\t\tAuthor\tPublisher\tFaculty Name\tFine\tDelay");
        for(i=0;i<No;i++)
        {
            // compare dates
            long diff = temp.getTime() - book[i].issueDate.getTime();
            int diffInDays = (int) ((diff) / (1000 * 60 * 60 * 24));
            if(diffInDays > 1 && diffInDays <= 7 && book[i].isFaculty == 1 && !book[i].bookname.equals("empty"))
            {
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher+"\t"+book[i].facultyName+"\t"+book[i].fine+"\t"+diffInDays);
            }
        }
    }
    void fine(Test[] book, int No)
    {
        int i;
        Date temp = new Date();
        for(i=0;i<No;i++)
        {
            // compare dates
            long diff = temp.getTime() - book[i].issueDate.getTime();
            int diffInDays = (int) ((diff) / (1000 * 60 * 60 * 24));
            if(diffInDays > 1 && diffInDays <= 7 && !book[i].bookname.equals("empty"))
            {
                book[i].fine = 2.5*diffInDays;
            }
            else if( diffInDays > 7 && !book[i].bookname.equals("empty"))
            {
                book[i].fine = 2.5*7 + 5*(diffInDays - 7);
            }
        }
    }
    void urgentRemind(Test[] book, int No)
    {
        int i;
        Date temp = new Date();
        System.out.println("ID\tBook Name\t\tAuthor\tPublisher\tStudent Name\tFine\tDelay");
        for(i=0;i<No;i++)
        {
            // compare dates
            long diff = temp.getTime() - book[i].issueDate.getTime();
            int diffInDays = (int) ((diff) / (1000 * 60 * 60 * 24));
            if(diffInDays > 7 && book[i].isStudent == 1 && !book[i].bookname.equals("empty"))
            {
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher+"\t"+book[i].studentName+"\t"+book[i].fine+"\t"+diffInDays);
            }
        }
        System.out.println("ID\tBook Name\t\tAuthor\tPublisher\tFaculty Name\tFine\tDelay");
        for(i=0;i<No;i++)
        {
            // compare dates
            long diff = temp.getTime() - book[i].issueDate.getTime();
            int diffInDays = (int) ((diff) / (1000 * 60 * 60 * 24));
            if(diffInDays > 7 && book[i].isFaculty == 1 && !book[i].bookname.equals("empty"))
            {
                System.out.println(book[i].bookID+"\t"+book[i].bookname+"\t"+book[i].author+"\t"+book[i].publisher+"\t"+book[i].facultyName+"\t"+book[i].fine+"\t"+diffInDays);
            }
        }
    }
}
class Student extends Librarybook
{
    void student()
    {

    }
    void faculty()
    {

    }
}
class Test extends Librarian
{
    public static void main(String[] args)throws IOException
    {
        Test[] book = new Test[1000];
        Test[] studentRecord = new Test[100];
        Test[] facultyRecord = new Test[100];
        Test obj = new Test();
        int i,j,k,ch,b=0,f=0,s=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<100;i++)
        {
            System.out.println("Choose\n1.Librarian\n2.Faculty\n3.Student\n4.Leave library\n");
            ch = Integer.parseInt(in.readLine());
            if(ch == 1)
            {
                System.out.println("Enter\n1.Add books\n2.Delete books\n3.View books\n4.View issued books\n5.Issue books\n6.Issue Reminder\n7.Issue additional reminder\n");
                ch = Integer.parseInt(in.readLine());
                switch(ch)
                {
                    case 1:
                    {
                        book[b] = new Test();
                        book[b].add(book[b]);
                        ++b;
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Choose the book number out of this list to delete: ");
                        obj.view(book,b);
                        int id;
                        id = Integer.parseInt(in.readLine());
                        book[id-1].delete(book[id-1]);
                        break;
                    }
                    case 3:
                    {
                        obj.view(book,b);
                        break;
                    }
                    case 4:
                    {
                        obj.viewIssue(book,b);
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Choose the book number out of this list to delete: ");
                        obj.view(book,b);
                        int id = Integer.parseInt(in.readLine());
                        System.out.println("Enter\n1.Faculty\n2.Student\n");
                        ch = Integer.parseInt(in.readLine());
                        book[id-1].issue(book[id-1],ch);
                        break;
                    }
                    case 6:
                    {
                        obj.fine(book,b);
                        obj.remind(book,b);
                        break;
                    }
                    case 7:
                    {
                        obj.fine(book,b);
                        obj.urgentRemind(book,b);
                        break;
                    }
                    default:
                        System.out.println("Wrong choice!");
                }
            }
            else if(ch == 2)
            {

            }
            else if(ch == 3)
            {

            }
            else
            {
                break;
            }
        }

    }
}
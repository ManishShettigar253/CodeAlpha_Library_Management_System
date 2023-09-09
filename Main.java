import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        BookServiceInterface service=new BookServiceImpl();

       do{
           System.out.println("--- LIBRARY MANAGEMENT SYSTEM ---");
           System.out.println("1.Add Book\n"+
                   "2.Display All Books\n"+
                   "3.Display Available Books\n"+
                   "4.Issue Book\n"+
                   "5.Return Book\n"+
                   "6.Exit\n"+
                   "-----------------------------------");

               System.out.print("Enter Your Choice : ");
               int ch = s.nextInt();

           switch (ch){
               case 1:
                   service.addBook();
                   break;
               case 2:
                   service.DisplayAllBooks();
                   break;
               case 3:
                   service.DisplayAllAvailableBooks();
                   break;
               case 4:
                   service.issueBook();
                   break;
               case 5:
                   service.returnBook();
                   break;
               case 6:
                   System.out.println("Thank you for Using Application !!");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Please Enter Valid Choice !");

           }
       }
       while(true);
    }
}

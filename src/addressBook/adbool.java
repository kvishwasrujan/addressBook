package addressBook;
import java.util.Scanner;


public class adbool {
	Scanner sc = new Scanner(System.in);
    //Nested class for each entry
    class Entry{
        private String first;
        private String last;
        private String address;
        private String email;
        Entry(String first, String last, String address, String email){
            this.first = first;
            this.last = last;
            this.address = address;
            this.email = email;
        }
        Entry(){
            first = "";
            last = "";
            address = "";
            email = "";
        }
        public void readEntry(){
            System.out.println("First Name:"+first );
            System.out.println("Last Name:"+last );
            System.out.println("Address:"+address );
            System.out.println("Email:"+email );
        }
    }
	
}






package addressBook;
import java.util.Scanner;
import java.util.ArrayList;
public class addressArraylist {
		String first_name;
		String last_name;
		String address;
		String city;
		String state;
		int zip;
		int phNum;
		String email;
		addressArraylist(String first_name,String last_name,String address,String city,String state,
		int zip,int phNum,String email){
			this.first_name = first_name;
			this.last_name = last_name;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phNum = phNum;
			this.email = email;	
			}

		public  void setfName(String first_name) {
			this.first_name = first_name;
		}
		public void setlName(String last_name) {
			this.last_name = last_name;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public void setPhnNum(int phNum) {
			this.phNum = phNum;
		}
		public String getfName() {
			return this.first_name;
		}
		public String getlName() {
			return this.last_name;
		}
		public String getAddress() {
			return this.address;
		}
		public String getCity() {
			return this.city;
		}
		public String getState() {
			return this.state;
		}
		public int getZip() {
			return this.zip;
		}
		public int getphnNum() {
			return this.phNum;
		}
		public String getEmail() {
			return this.email;
		}
		public void addCont() {
			ArrayList<String> extraContact = new ArrayList<String>();
			Scanner sc=new Scanner(System.in);
			System.out.println("First Name:");
			String first_name2 = sc.nextLine();
			extraContact.add(first_name2);
			System.out.println("Last Name:");
			String last_name2 = sc.nextLine();
			extraContact.add(last_name2);
			System.out.println("Address:");
			String address2 = sc.nextLine();
			extraContact.add(address2);
			System.out.println("City:");
			String city2 = sc.nextLine();
			extraContact.add(city2);
			System.out.println("State:");
			String state2 = sc.nextLine();
			extraContact.add(state2);
			System.out.println("Zip Code:");
			int zip2 = sc.nextInt();
			String Zip2 = String.valueOf(zip2);
			extraContact.add(Zip2);
			System.out.println("Phone Number:");
			int phNum2 =sc.nextInt();
			String PhNum2 =String.valueOf(phNum2);
			extraContact.add(PhNum2);
			System.out.println("Email:");
			String email2=sc.next();
			extraContact.add(email2);
			sc.close();
			System.out.println("Your New Contact");
			for(String i:extraContact) {
				System.out.println(i);
			}
			
		}
	     public static void main(String[] args) {
			addressArraylist obj = new addressArraylist("csd","csdc","cwdc","wfca","cda",9,0,"wcs");
			Scanner sc=new Scanner(System.in);
			System.out.println("First Name:");
			String first_name = sc.nextLine();
			System.out.println("Last Name:");
			String last_name = sc.nextLine();
			System.out.println("Address:");
			String address = sc.nextLine();
			System.out.println("City:");
			String city = sc.nextLine();
			System.out.println("State:");
			String state = sc.nextLine();
			System.out.println("Zip Code:");
			int zip = sc.nextInt();
			System.out.println("Phone Number:");
			int phNum =sc.nextInt();
			System.out.println("Email:");
			String email=sc.next();
			obj.setfName(first_name);
			obj.setlName(last_name);
			obj.setAddress(address);
			obj.setCity(city);
			obj.setState(state);
			obj.setZip(zip);
			obj.setPhnNum(phNum);
			obj.setEmail(email);
			System.out.println(obj.getfName());
			System.out.println(obj.getlName());
			System.out.println(obj.getAddress());
			System.out.println(obj.getCity());
			System.out.println(obj.getState());
			System.out.println(obj.getZip());
			System.out.println(obj.getphnNum());
			System.out.println(obj.getEmail());
			obj.addCont();
			sc.close();
			

		}

	}



package emailapp;
import java.util.*;
public class Email {
	
	private String firstname, lastname,email, department, password, alternateEmail,suffixx="amazon.in";
	
	private int mailboxcapacity,paswordLength=14;
	
	//Constructor to recieve firstname and lastname 
	public Email(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println("Email Generated :"+this.firstname+" "+this.lastname);
		
		//call a method to set department and preserve Encapsulation
		this.department=setDepartment();
		//System.out.println(this.department);
		
		//call a method to generate an automated password
		this.password=randompassword(paswordLength);
		//System.out.println("Your Default password"+" "+this.password);
		
		//email
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+suffixx;
		//System.out.println("Your Email is :"+" "+ email);
	}

	private String setDepartment() {
		System.out.println("Enter the department:\n1 Finance\n2 Marketing\n3 Consultancy\n4 Legal\n");
		Scanner scan=new Scanner(System.in);
		int depart=scan.nextInt();
		if(depart==1) {return "Finance";}
		else if(depart==2) {return "Marketing";}
		else if(depart==3) {return "Consultancy";}
		else {return "Legal";}
	}
	
	private String randompassword(int length) {
		String pase="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*!";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int x=(int)(Math.random()*pase.length());
			password[i]=pase.charAt(x);
		}
		return new String(password);
	}
	
	// set mailbox capacity
	public void setMailboxcapacity(int cap) {
		this.mailboxcapacity=cap;
	}
	//set alternate email
	public void setAlternateEmail(String s) {
		this.alternateEmail=s;
	}
	//set new password
	public void setPassword(String ss) {
		this.password=ss;
	}
	
	public int getMailboxcapacity() {return mailboxcapacity;}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;}
	
	public String showinfo() {
		return "\nFull Name "+ firstname+lastname+
				"\nDepartment "+department+
				"\nDefault Password "+password+
				"\nEmail"+" "+email;
	}

}






















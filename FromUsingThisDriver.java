import java.util.Scanner;
class FromUsingThisDriver
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		FromUsingThis f1=new FromUsingThis();
		System.out.println(" '*' Mark filds are mandatory");
		System.out.println("Enter Your Name* : ");
		f1.name=sc.next();
		System.out.println("Enter Your Age* :");
		f1.age=sc.nextInt();
		System.out.println("Enter Your PhoneNO* :");
		f1.phno=sc.nextLong();
		System.out.println("Enter Your Location *:");
		f1.location=sc.next();
		System.out.println("Enter Your Blood Group: ");
		f1.blood=sc.next();
		System.out.println("Enter Your Telephone Number:");
		f1.telPhon=sc.nextLong();
		
		f1.displayFrom();
		
		
		
		/*f1.name="Pawan";
		f1.age=22;
		f1.phno=1234567896L;
		f1.email="pawan@gmail.com";
		f1.location="Hingoli";
		f1.blood="B+";
		f1.telPhon=123456L;
		f1.displayFrom();*/
	}
}

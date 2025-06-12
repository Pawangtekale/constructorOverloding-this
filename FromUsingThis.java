class FromUsingThis 
{
	String name;
	int age;
	long phno;
	String email;
	String location;
	String blood;
	long telPhon;
	
	FromUsingThis(){}
	
	FromUsingThis(String name,int age,long phno,String location){
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.location=location;
		
	}
	FromUsingThis(String name,int age,long phno,String location,String blood){
		this(name,age,phno,location);
		this.blood=blood;
	}
	FromUsingThis(String name,int age,long phno,String location,String blood,long telPhon)
	{
		this(name,age,phno,location,blood);
		this.telPhon=telPhon;
	}
	public void displayFrom(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone: "+phno);
		System.out.println("Email: "+email);
		System.out.println("Location: "+location);
		System.out.println("Blood Group: "+blood);
		System.out.println("Telephone No: "+telPhon);
	
	}
}

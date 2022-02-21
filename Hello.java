public class Hello {

	public static void main(String[] args) {
		Emp e1= new Emp();  // Object of Emp
		e1.getData("Developer", 20, 1010);
		e1.print();
		Mngr m1=new Mngr();  //Object of Mngr
		m1.getData2("Manager2Project1", 30, 1011, 8);
		m1.print2();
		Emp e2=new Mngr(); //a Mngr object is generalized into an Emp object
		e2 = m1; //we get all the generalized qualities of a Mngr as an Emp
		e2.print(); //"Manager2Project1", 30, 1011
		Mngr m2=(Mngr)new Emp(); //Specialization 
		m2=(Mngr)e2;
		m2.print2();				
	}
	
}

class Emp{ //Class concept : encapsulation
	private String name; //Data Hiding : encapsulation : Hides from everyone except the class
	protected int sal; //Data Hiding : encapsulation : Hides from everyone except the package and their hierarchy
	int id; ////Data Hiding : encapsulation : Hides from everyone except the package
	public void getData(String n, int s, int i) //Data Sharing : Abstraction
	{
		name=n;
		sal=s;
		id=i;
	}
	public void print() {  //Data Sharing : Abstraction
		System.out.print("\nName : "+name+" Earning : "+sal + "L with id : "+id);
	}
}
class Mngr extends Emp{ //Inheritance
	int team;
	public void getData2(String n, int s, int i, int t) 
	{
		getData(n,s,i);
		team=t;
	}
	public void print2() {  
		print();
		System.out.println(" with Team Size : "+team + " Members.");
	}
}

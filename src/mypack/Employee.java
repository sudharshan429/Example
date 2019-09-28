package mypack;

/*public class Employee {
	float salary=40000;  
	}  
 class A{
	void msg(){
		System.out.println("Hello");
	}
	 class B{
		void msg(){
			System.out.println("Welcome");
		}
	}
}
class Programmer extends Employee{  
	   int bonus=10000;  
	   public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  
*/

/*interface Employee{
	void method1();
}
 interface A{
	
	void method1();
 
	class B implements A,Employee{

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
}*/
public abstract class Employee
{
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number)
   {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public double computePay()
   {
     System.out.println("Inside Employee computePay");
     return 0.0;
   }
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + this.name
       + " " + this.address);
   }
   public String toString()
   {
      return name + " " + address + " " + number;
   }
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public void setAddress(String newAddress)
   {
      address = newAddress;
   }
   public int getNumber()
   {
     return number;
   }
}


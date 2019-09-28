
public class ConstructorExample {
	
	//class Student{
		int id;
	    String  name;
	    int age;
		public ConstructorExample(int i, String n) {
			
			 id=i;
			  name=n;
		}
		public ConstructorExample(int r,String g,int s){
			id=r;
			name=g;
			age=s;
		}
		void display(){
			System.out.println(id+" "+name+" "+age);
		}
		public static void main(String[] args){
			ConstructorExample s1=new ConstructorExample(111,"aaa");
			ConstructorExample s2=new ConstructorExample(222,"ggg",34);
			s1.display();
			s2.display();
			
			
			
		}
	}



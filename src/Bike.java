

interface Simple{ 
	int x=10;
  void run();

} 
/*interface inf2 extends Simple{
	void eat();
	void run();
	 public static final int a=10;
	 
}*/
interface A
{
	int x=20;
	void eat();
	void run();
	
}
  class sum implements Simple,A{

	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running successfully");
	}
*/
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating sucessfully");
		}  
	public void run(){
		System.out.println("running");
	}
	public static void main(String []args){
		System.out.println(A.x);
		A obj=new sum();
		obj.eat();
		obj.run();
		
	}
  }  
   
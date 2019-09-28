package com.pack.test;

  abstract class Pack {
	  abstract int draw();
	}  
  class A extends Pack{

	@Override
	int draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
		return 0;
		
	}
  }
	class B extends Pack{

		@Override
		int draw() {
			// TODO Auto-generated method stub
			System.out.println("drawing circle");
			return 0;
			
		}
		
	}
	  
   class c {
	  
	public static void main(String args[]){  
		Pack a=new B();
		//a.draw();
		int interest=a.draw();    
		System.out.println("Rate of Interest is: "+interest+" %");   
	}  
   }



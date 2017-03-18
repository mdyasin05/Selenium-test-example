package myfirstPackage;

public class ClassTest {

	public static void main(String[] args) {
		
		ClassTest cl=new ClassTest();
		
		cl.test2(10,30);
		cl.test2(100,30);
		cl.test2(300, 400);
		
		 //System.out.println(cl.test3(2, 3));
		
		int pop=cl.test3(22, 25);
		System.out.println(pop);
		
	}
		
	public static void test1() {
	
	System.out.println("The system is right");
	
	}


	public void test2(int x,int y) {
		
		//int x=40;
		//int y=20;
		
		System.out.println(x+y);
		

	}


	public int test3(int c,int r) {
		
		int result=c+r;
		
		return result;

	}



}

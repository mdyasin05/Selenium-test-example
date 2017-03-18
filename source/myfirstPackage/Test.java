package myfirstPackage;

public class Test {

	public static void main(String[] args) {
		Test ts=new Test();
		ts.test2(20, 30);
		ts.test3(35, 45);
		test1();
		System.out.println(ts.test3(20, 30));
		System.out.println(ts.test4("aaa"," bbb ",5));
	}
	public static void test1(){
		
		System.out.print("method is right");
		System.out.println("and fantastic");
	}
	public String test4(String x, String y,int p){
        //System.out.println();
		String result = x+y+p;
		return result;
	}
	
	public void test2(int a, int b){
		
		System.out.println(a+b);
	}
	public int test3(int a, int b){
		//System.out.println();
		int result = a+b;
		return result;
	}
	
}






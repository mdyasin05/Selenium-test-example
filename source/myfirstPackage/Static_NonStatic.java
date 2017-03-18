package myfirstPackage;

public class Static_NonStatic {

	public static void main(String[] args) {
		
		Static_NonStatic st=new Static_NonStatic();            // object reference of class 
		
		System.out.println("Main method 1");
		
		test();
		//st.test2(10,20);
		//st.test2(100,200);
		//st.test3(200, 100);
		//st.test3("badol", "mollah");
		st.test2("nnnn", 30);
		System.out.println(st.test3("ikbal ", "bhy"));
	
		
	}
	
	public static void test(){
		
		System.out.println("Main method 2 ");
	}
	
	
	public void test2(String x,int y){
		
//		int x=60;
//		int y=40;
		
		System.out.println(x+y);
	}
	
	
	public String test3(String x,String y){// Return only one  data type at a time 
				
		//int x=10;
		//int y=20;
		
		String result=x+y;
//		System.out.println(x+y);
		return result;
//		
	}
    
	}



package myfirstPackage;

public class Publicprivatprotected {

	public static void main(String[] args) {
		Publicprivatprotected pt=new Publicprivatprotected(); 
		pt.pub();
		pt.priv1();
		pt.prot();
	}
	
	public void pub(){
		                                         //public can be accessable from any class,any package under the same project 
		                                        
		System.out.println("public method  is true");
	}
	
	private void priv1(){// private only accessable with in the same class
		
		System.out.println("private method");
	}

	protected void prot(){// any class with in the same package 
		
		System.out.println("protected method");
	}
}

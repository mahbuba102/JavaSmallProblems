
public class NullMethodOverloadDemo {

	public static void m(String a){
		System.out.println("String");
	}
	public static void m(int a){
		System.out.println("int");
	}
	public static void m(Object o){      
		System.out.println("Object");
	}
	public static void m(Integer i){      
		System.out.println("Integer");
	}

	public static void main(String[] args) {

		NullMethodOverloadDemo nd = new NullMethodOverloadDemo();
		//nd.m(null);  //compilation error
	}
	

}

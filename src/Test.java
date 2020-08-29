
public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println("///////////////////////DIAMOND////////////////////");	
		int length = 3;
		for(int i =0;i<length;i++){
			for(int j = 0;j<length-i;j++){
				System.out.print(" ");
			}
			for(int k =0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=length;i>=0;i--){
			for(int j=0;j<length-i;j++){
				System.out.print(" ");
			}
			for (int k= 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("///////////////////TRIANGLE/////////////////////////");
		
		for(int i =0;i<length;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("///////////////Number Pyramids/////////////////");
		
		for(int i =0;i<length;i++){
			for(int j=0;j<length-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
		for(int i=length;i>0;i--){
			for(int j = 0;j<=length-i;j++){
			    System.out.print(" ");                      
			}
			for(int k = 0;k<i;k++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}


public class Problems {


	private static void printFibonacciSeries() {
		int n = 20;
		int temp1 = 1;
		int temp2 = 1;
		int result = 0;
		System.out.println("Printing fibonacci series :");
		System.out.print(temp1+" ");
		System.out.print(temp2+" ");
		for(int i = 1;i<=n;i++){
			result = temp1+temp2;
			if(result<20)
				System.out.print(result+" ");
			temp2 = temp1;
			temp1 = result;
		}
		System.out.println();

	}


	private static void printLongestPalindrome() {
		String text = "Marry";
		boolean isPalindromicSubstring = false;
		int subStringStart = 0;
		int subStringLength = 0;

		for(int i =0;i<=text.length()-1;i++){

			if(text.charAt(i)!=text.charAt(text.length()-1-i))
				continue;
			else{

				if(text.charAt(i)==text.charAt(text.length()-i)){

					isPalindromicSubstring = true;
					System.out.println(text.charAt(i));
					subStringStart = text.indexOf(text.charAt(i));
					subStringLength++;
				}
			}

		}


		if(isPalindromicSubstring ){
			System.out.println("Substring start :="+subStringStart+" "+"Substring Length :="+subStringLength);

			System.out.println("Longest Palindromic Substring is : "+text.substring(subStringStart,subStringStart+ subStringLength));
		}
	}

	private static void checkPalindrome() {
		String text = "noon";
		boolean isPalin = true;
		if(text.length()==0){
			isPalin = false;
		}
		else if(text.charAt(0)!=text.charAt(text.length()-1)){
			isPalin = false;
		}

		else{
			for(int i=1;i<=text.length()-1;i++){
				if(text.charAt(i)!=text.charAt(text.length()-1-i)){

					isPalin = false;
				}
			}
		}

		if(isPalin){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("It is not a palindrome");
		}
	}
	
	private static void power() {
		int base = 2;
		int power = 0;
		int result = 1;
		if(power==0){
			System.out.println(base+"^"+power+"="+result);
		}
		else if (power==1){
			System.out.println(base+"^"+power+"="+base);
		}

		else{
			for(int i = 0;i<4;i++){
				result*=base;
			}
		}

		System.out.println(base+"^"+power+"="+result);
	}


	public static void main(String[] args) {
		//printFibonacciSeries();

		//checkPalindrome();

		//printLongestPalindrome();

		power();
		
		char c = 8;
		System.out.println(c*c);
	}


	




}

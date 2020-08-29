
public class StringMultiplicationDemo {

	public static void main(String[] args) {

		String s1 = "1247";
		String s2 = "3467";
		int num1 = 0;
		int num2 = 0;
		int multi = 0;

		char number1[] = s1.toCharArray();
		char number2[] = s2.toCharArray();

		int power = 1;
	/*	for(int i = s1.length()-1;i>=0;i--){

			num1+=(number1[i]-'0')*power;
			num1 = num1+number1[i];
			power*=10;
		}*/
		int factor1 = 1;
		for (int i = s1.length()-1; i >= 0; i--) {
			num1 += (s1.charAt(i) - '0') * factor1;
			factor1 *= 10;
		}
		
		int factor2 = 1;
		for (int i = s2.length()-1; i >= 0; i--) {
			num2 += (s2.charAt(i) - '0') * factor2;
			num2 += (s2.charAt(i))  * factor2;

			factor2 *= 10;
		}

		/*	for(int i = s2.length()-1;i>=0;i--){

			num2+=(s2.charAt(i)-'0')*power;
			num2 = num2+number2[i];
			power*=10;
		}*/


		System.out.println("Number One = "+num1);
		System.out.println("Number Two = "+num2);
		System.out.println("Multiplication of to numeric strings is : = "+num1*num2);
		/*for(int i = s2.length()-1;i>=0;i--){
			num2+=number2[i]*10^power;
			power*=10;
		}

		multi = num1 * num2;
		System.out.println("Number One = "+num1);
		System.out.println("Number Two = "+num2);
		System.out.println("The result of string mutiplication = "+multi);


		char c = 5;
		int i = 6;
		System.out.println(c*i);*/
		System.out.println((char)0);
	}


}

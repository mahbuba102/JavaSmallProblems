
public class StringConcatenation {
	
	public static void main(String[] args) {
		
		
		String s="I"+"am"+"good"+"boy";
		System.out.println(s);
		
		
		StringBuffer sb = new StringBuffer("I");
		sb.append("am");
		sb.append("good");
		sb.append("boy");
		System.out.println(sb);
		
		
		
		String s3 = "I";  
		String s1 = s.concat("am").concat("good").concat("boy");
		System.out.println(s1);
	}

}

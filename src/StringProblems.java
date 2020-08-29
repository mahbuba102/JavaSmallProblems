
public class StringProblems {

	public void n(String a){
		System.out.println(a);
	}

	public static void m(String a){
		System.out.println("String");
	}
	public static void m(int a){
		System.out.println("int");
	}

	public static void m(Object o){      
		System.out.println("Object");
	}

	public static void main(String[] args) {

		String a = "not a final string";
		final String b = "final string";
		String x = a;
		String z = new String ();
		z = b;


		////////////////////////////////length of a string///////////////////////

		char stringarray[] = a.toCharArray();
		int len = 0;
		for(char c:stringarray){
			len++;
		}
		System.out.println("Length by length() function:" + a.length());
		System.out.println("Length by my function :"+len);
		///////////////////////////////////////////////////////////////////////



		////////////////////////////////length of a null string//////////////
		String nullstring = null;
		String noninitialized;
		// System.out.println(nullstring.length()); //nullpointer exception

		String emptystring = "";
		System.out.println(emptystring.length()); //0
		System.out.println("Comparison :"+nullstring==emptystring); //false
		System.out.println("printing a null string : "+nullstring);
		//  System.out.println("printing a non-initialized string :"+ noninitialized); //compiler error need to initialize the variable
		//	System.out.println(null); //compilation error :null is ambiguous type 

		/////////////////////////////////////////////////////////////////////



		///////////////////////////intern method :: string///////////////////////
		String s1 = "giselle";
		String s2 = "giselle";
		String s3 = "giselle".intern();
		String s4 = new String("giselle");
		String s5 = new String("giselle").intern();

		if ( s1 == s2 ){
			System.out.println("s1 and s2 are same");  // will print
		}
		else{
			System.out.println("s1 and s2 are not same");
		}



		if ( s1 == s3 ){
			System.out.println("s1 and s3 are same" );  // will print
		}

		else{
			System.out.println("s1 and s3 are not same" );
		}


		if ( s1 == s4 ){
			System.out.println("s1 and s4 are same" );  // will not print
		}
		else{
			System.out.println("s1 and s4 are not same");
		}


		if ( s1 == s5 ){
			System.out.println("s1 and s5 are same" );  // will print
		}

		else{
			System.out.println("s1 and s5 are not same" );
		}
		/////////////////////////////////////////////////////////////////////////

		/////////////////////swapping two string variables////////////////////////



		String p = "new york";
		String q = "new jersey";
		System.out.println("Before swapping : "+"p = "+p+","+"q = "+q);
		int pBeginLength = p.length();

		p+=q;
		System.out.println("p in the middle:"+p);
		int pEndingLength = p.length();
		//p=p.substring(pBeginLength,pEndingLength); //doesn't work if this statement is here
		q=p.substring(0,pBeginLength);
		p=p.substring(pBeginLength,pEndingLength);
		


		System.out.println("After swapping : "+"p = "+p+","+"q = "+q);

		/////////////////////////////////replace a character in a string without java api///////////////////////////////////////////


		String  r1 = "Hello world";
		System.out.println("Before replacement :"+r1);
		char c = 'd';
		char key = 'f';
		char r1array[] = r1.toCharArray();
		int index = 0;
		for(char character :r1array){
			if(character==c){
				r1array[index] = key;
			}
			index++;
		}
		String r2 = new String (r1array);
		r2.intern();
		System.out.println("After replacement : "+r2);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		//////////////////////null passed as an argument////////////////////////////////////////
		//char characterarray[] = null;
		StringProblems sp = new StringProblems();
		sp.n("Null passed as a parameter :"+null);

		////////////////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////null method overloading example////////////////////////////////////////////
		
		sp.m(null);
		////////////////////////////////////split/////////////////////////////////////////////////////////
		
		String k = "12 3 4 abcd 3";
		String [] kArray = k.split(" ");
		int result = 0;
		for(String s : kArray){
			if(s.matches("^[1-9][0-9]*$")){
				
				result+=Integer.parseInt(s);
			}
		}
		
		System.out.println("Addition :"+result);
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////letters in a string///////////////////////////////////////////////////////////
		
		//////method - 1:no Regex/////
		String characters = "asd345*mkldg123";
		char [] characterarray = characters.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<characters.length();i++){
			if(Character.isLetter(characters.charAt(i))){
				sb.append(characters.charAt(i));
				
			}
		}
		
		System.out.println(sb + ", No of letters : " +sb.length());
		
		//////method - 2:using regex
		
		String lettersonly = characters.replaceAll("[^A-Za-z]+", "");
		System.out.println(lettersonly+" , No of letters : "+lettersonly.length() );
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////index  of a pattern or a character//////////////////////////
		/*String mainstring = "don’t be evil.being evil is bad";
		String keyword = "be";
		int iIndex = mainstring.indexOf(keyword);
		while(index>=0 &&index<=mainstring.length()){
			System.out.println(iIndex);
			index = mainstring.indexOf(keyword,iIndex+keyword.length());
		}*/
		///////////////////////occurance of a pattern or a character//////////////////////////
		
		String string1 = "mahbuba";
		String string2  = "nimme";
		 
		System.out.println(string1+"nimme");
		
		
	     System.out.println("Hashcode test of String:");  
	        String str="java";  
	        System.out.println(str.hashCode());  
	        str=str+"tpoint";  
	        System.out.println(str.hashCode());  
	   
	        System.out.println("Hashcode test of StringBuffer:");  
	        StringBuffer sb1=new StringBuffer("java");  
	        System.out.println(sb1.hashCode());  
	        sb1.append("tpoint");  
	        System.out.println(sb1.hashCode());  
	        
	        Object obj = new Object ();
	     //s   System.out.println(obj.);
	}

}

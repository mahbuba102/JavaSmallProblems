import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Amazon extends RuntimeException{

	int x = 5;
	public static void main(String[] args) {
		
	/*	Integer no = new Integer("jashdj");
		
		int i = 2;int j=0;
		j=(i++ + i++)* --i;
		System.out.println(j);*/
		int a = 0;
		System.out.println(a%1);
		
		Map <String,Integer> mp = new HashMap <String,Integer> ();
		//mp.put("key", "123");
		
		System.out.println(String.format("%tH:%tM:%tS"+LocalTime.now(),LocalTime.now(),LocalTime.now()));
		
	}

	
}

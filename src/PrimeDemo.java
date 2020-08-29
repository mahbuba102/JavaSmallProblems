
public class PrimeDemo {

	public static int getPrime (int number ){
		for(int i=2;i<number;i++){
			if(number%i == 0)
				return 0;
		}
		
		return number;
	}
	
	public static void main(String[] args) {
		/*int a[] = {1,2,3,4,5,6,7,8,9,10};
		int prime [] =new int [10];
		for(int i =0;i<10;i++){
			prime[i] = getPrime(a[i]);
		}
		for(int i =0;i<10;i++){
			System.out.println(prime[i]);
		}*/
		
		for(int i=1;i<=100;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					break;
				}
				else{
					System.out.println(i);
				}
			}
		}
	}

}

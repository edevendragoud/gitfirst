

package EXAM3;

public class primenumber {
	public static boolean primenumber(int num){
		
		if(num<=1){
			return false;
		}
		 for(int i=2; i<num;i++){
			 if(num % i==0){
			return false;	 
			 }
		
		 }
		return true;
		 
	}
public static void getprimenumber(int num){
	for(int i=2;i<num;i++){
		if (primenumber(i))
			System.out.println(i+" ");
	}
}
	
	
	
	public static void main(String[] args) {
		
System.out.println(  "10 is prime number" +primenumber(10) );
getprimenumber(120);
	}

}

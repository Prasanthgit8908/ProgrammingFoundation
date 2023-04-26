
public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 9;
		int counter = number ;
		int result =1;
		
		while(counter>=1) {
			result = result * counter ; 
			counter -- ;  //counter = counter -1;
		}
		
		System.out.println("fact result" + result);

	}

}

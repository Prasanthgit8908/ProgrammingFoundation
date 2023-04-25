import java.util.Scanner;

public class Main {

	public static float add(float a, float b) {
		return a + b;
	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float mul(float a, float b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print a simple mesage 
		System.out.println("Hello from Java8908");
		
		//inputs
		float numberA = 10.4f;//10.4 is  a float value.
		float numberB = 14.2f;
		
		//process
		// addition of  2 numbers
		// result varibale will hold the addition result 
		float result =0;
		result = numberA + numberB;
		System.out.println("result of numbers="+result);
		
		System.out.println("Enter the options based on choice" +
		" \n 1. Add \n 2. sub  \n 3. div \n 4. mul \n 5. exit");
		
		//we need to work now  with scanner class and  it is designed  to accept the inputs from the user  
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter the options based on choice" +
					" \n 1. Add \n 2. sub  \n 3. div \n 4. mul \n 5. exit");
		int choice = scanner.nextInt();
		
		//int choice = 30;

		switch (choice) {

		case 1: {
			System.out.println("addition case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = add(number1 , number2);
			System.out.println("the result of  addition is" +result1);
					

		}
			break;
		case 2: {

			System.out.println("subtraction case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = sub(number1 , number2);
			System.out.println("the result of  subtraction is" +result1);
		}
			break;
		case 3: {
			System.out.println("dividend  case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = div(number1 , number2);
			System.out.println("the result of multiplication is" +result1);

		}
			break;
			
		case 4: {
			System.out.println("multiplication case");
			System.out.println("Pls enter 2 numbers ");
			float number1 = scanner.nextFloat();
			float number2= scanner.nextFloat();
			
			System.out.println(number1);
			System.out.println(number2);
			
			float result1 = mul(number1 , number2);
			System.out.println("the result of  dividend is" +result1);

		}
			break;
			
		case 5: {
			System.out.println("5");
			System.exit(0);// end the execution of the program.

		}
			break;
			default:{
				System.out.println("default case");
			}
		
		}
	}

}
}

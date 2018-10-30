package Convert;

public class fizzBuzz {
	
	public static void main(String[] args) {

		for(int i =0; i <100; i++) {
			if (i > 0 &&i % 15 == 0) {
				System.out.println("FizzBuzz");
			}
			else if ( i > 0 && i % 5 == 0) {
				System.out.println("buzz");
			}
			else if ( i > 0 && i % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
			
			
		
	}

}
}
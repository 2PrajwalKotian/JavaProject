package traing;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,fact=1;
		if(n!=0) {
		while(n!=0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println("The factorial of a number :" +fact);
		}
		else
			System.out.println("The factorial of a number "+n+"is :" +fact);
		

	}

}

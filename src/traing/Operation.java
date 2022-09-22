package traing;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation obj = new Operation();
		int sum=obj.add(20,50);
		System.out.println("The addition of 2 numbers :" +sum);
		int sub=obj.sub(20,50);
		System.out.println("The subtraction of 2 numbers :" +sub);
		obj.multi(2,3);
		obj.div(4,2);
	}
	int add(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	int sub(int x,int y)
	{
		int sub=x-y;
		return sub;
	}
	void multi(int x,int y) 
	{
		int multi=x*y;
		System.out.println("The multiplication of 2 numbers :" +multi);
	}
	void div(int x,int y) 
	{
		int div=x/y;
		System.out.println("The division of 2 numbers :" +div);
	}
}

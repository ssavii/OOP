public class ExceptionClient{
	public static void main(String[] args){
		ExceptionClient client= new ExceptionClient();
		try{
			int result=client.getDivision(10, 5);
			System.out.println("Division result is : "+ result);
			int[] a = {1,2,3,4,5};
			client.test(a);
		}
		catch(ArithmeticException e){
			System.out.println("OOPS!!Division by zero can not be performed ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("OH OH!!Can not access a larger index");
		}
		finally{
			System.out.println("I will always be executed :)");
		}
	}
	public int getDivision(int a, int b){
		return a/b;
	}
	
	public void test(int[] a){
		System.out.println(a[a.length+1]);
	
	}
}

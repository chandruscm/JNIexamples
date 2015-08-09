import java.util.Scanner;

public class factorial
{
  native int fact(int num);

  static
  {
	System.loadLibrary("forfact");
  }

  public static void main(String args[])
  {
	Scanner inp = new Scanner(System.in);
	
	System.out.println(" > Enter number :: ");
	int num = inp.nextInt();

	factorial obj = new factorial();

	System.out.println(" > The factorial of "+num+" is "+obj.fact(num));
  }
}

	

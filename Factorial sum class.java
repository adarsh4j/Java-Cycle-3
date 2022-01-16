import java.util.*;

class factorialsumclass

{

	int a,b;	
  public static void main(String[] args)

	{

		factorialsumclass f = new factorialsumclass();

		f.Input();

    f.factorial();

		f.sum();

	}

	void Input()

	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number whose factorial has to be found : ");

        a = sc.nextInt();

        System.out.print("Enter the number whose Sum of digits has to be found : ");

        b= sc.nextInt();

	}

	void factorial()

	{

		int i,fact=1;

		while(a!=0)

		   fact=fact*a--;

		System.out.println("factorial is " + fact);

	}

	void sum()

	{

		int s = 0;

		while(b>0)

		{

			s = s + (b%10);

			b=b/10;

		}

		System.out.println("Sum of digit of number entered is " +s);

	}

}

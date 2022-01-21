import java.util.*;

class Stringnum

{

	public static void main(String[] args)	{

		Scanner sc = new Scanner(System.in);

		Stringnum obj = new Stringnum();

		

		System.out.println("The first string is");

		String str1 = sc.nextLine();

		System.out.println("The second string is");

		String str2 = sc.nextLine();

		System.out.println("The first number is");

		int a = sc.nextInt();

		System.out.println("The second number is");

		int b = sc.nextInt();

		obj.num(str1,str2);

		obj.num(a,b);

	}

	void num(int a, int b)

	{

		String p = Integer.toString(a);

		String q = Integer.toString(b);

		int d = Integer.parseInt(p+q);

		System.out.println("The concatenated number is "+ d);   

	}

	

	void num(String str1 , String str2)

	{

		String str3 = str1.concat(str2);

		System.out.println("The concatenated string is "+ str3);

	}

	

}

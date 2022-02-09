import java.util.*;

class Student 

{

	public static void main(String args[])

	{

		Student obj = new Student();

		obj.read();

	}

	void read()

	{

		int a[] = new int[10];

		Scanner sc = new Scanner(System.in);

		int i;

		Student s1 = new Student();

		System.out.println("Enter the name: ");

		String name = sc.nextLine();

		System.out.println("Enter the roll no");

		int r = sc.nextInt();

		System.out.println("Enter the mark");        for(i=0;i<5;i++)

		   a[i]=sc.nextInt();

		 s1.display(name,r,a);

	}

	void display(String name,int r,int a[])

	{

		int i;

		System.out.println("Name is "+name);     
  
  System.out.println("Roll no is "+r);

		System.out.println("Mark is ");

		 for(i=0;i<5;i++)

		  System.out.println(a[i]);

	}

}				

		

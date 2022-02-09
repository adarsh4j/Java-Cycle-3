import java.util.*;

class employee

{

	 int empno, phoneno;   
   String name;

public static void main(String[] args)

{

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of employee : ");

    int n = sc.nextInt();

    employee e[] = new employee[n];

    for(int i=0; i<n ; i++)

    {

    e[i] = new employee();

        System.out.print("Enter the employee number of Employee " + (i+1)+":");

        e[i].empno = sc.nextInt();

        System.out.print("Enter the name of employee ");

        e[i].name = sc.next();

        System.out.print("Enter the Phone Number of employee ");

        e[i].phoneno = sc.nextInt();

    }

    for(int i=0;i<n;i++)

    {

    System.out.println();

    System.out.println("Employee Number : " + e[i].empno);

    System.out.println("Employee name : "+e[i].name);

    System.out.println("Employee Phone Number : " + e[i].phoneno);

    }

}

}

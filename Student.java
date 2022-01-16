import java.util.*;

class Student

{

 void Read()

 {

  Scanner sc=new Scanner(System.in);

  Student obj=new Student();

  int rollno;

  String name;

  int marks[]=new int[5];

  

  System.out.println("Enter the name:");

  name=sc.nextLine();

  

  System.out.println("Enter rollno:");

  rollno=sc.nextInt();

  

  for(int i=0;i<5;i++)

  {

   System.out.println("Enter marks of Subject"+(i+1));

   marks[i]=sc.nextInt();

  }

  obj.display(name,rollno,marks);

 }

 

 void display(String name,int rollno,int marks[])

 {

  System.out.println("Name is:"+name);

  System.out.println("Rollno is:"+rollno);

  

  for(int i=0;i<5;i++)

  {

   System.out.println("Marks of Sub"+(i+1)+" is "+marks[i]);

  }

 }

   

 public static void main(String args[])

 {

  Student s1=new Student();

  

  s1.Read();

 }

}

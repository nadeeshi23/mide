//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Emp {
    private String name;
    private int age;
    private double salary;
   public Emp(){
this.name="";
this.age=0;
this.salary=0.0;
    }
    public Emp(String name,int age,double salary){
this.name=name;
this.age=age;
this.salary=salary;
    }
    public static void main(String[] args) {
Emp em1 = new Emp("alex",20,127.00);
Emp em2 = new Emp("nid",21,188.00);
Emp em3 = new Emp("sham",22,155.00);
Emp em4 = new Emp("yohi",28,190.00);
Emp em5 = new Emp("thush",26,420.00);

System.out.println("Salary for the month of July : ");
System.out.println("================================");
System.out.println("emp name\tage\tsalary");
System.out.println("================================");

System.out.println(em1.name+"\t\t"+em1.age+"\t\t"+em1.salary);
System.out.println(em2.name+"\t\t"+em2.age+"\t\t"+em2.salary);
System.out.println(em3.name+"\t\t"+em3.age+"\t\t"+em3.salary);
System.out.println(em4.name+"\t\t"+em4.age+"\t\t"+em4.salary);
System.out.println(em5.name+"\t\t"+em5.age+"\t\t"+em5.salary);
double total =em1.salary+em2.salary+em3.salary+em4.salary+em5.salary;
System.out.println("total\t\t\t\t"+total);

int num;
System.out.println("enter a number");
Scanner x = new Scanner(System.in);
num = x.nextInt();
System.out.println("multiplication table for"+num);
for(int i=1;i<=12;i++){
    System.out.println(i+"\t"+"* "+num +" ="+(i*num));
}

   }
    }

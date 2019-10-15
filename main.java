//this is java file example

import java.util.Scanner;

class Calci
{
public static void main(String[] args)
{
Scanner ref=new Scanner(System.in);


boolean exit=false;

while(!exit)
{
System.out.println("Enter two numbers");
double d1=ref.nextDouble();
double d2=ref.nextDouble();

System.out.println("Enter your choice:");
String cmd=ref.next();
switch(cmd)
{

case "add": System.out.println("Add=" +(d1+d2));
             break;
case "sub": System.out.println("Sub=" + (d1-d2));
             break;
case "mul": System.out.println("Mul=" +(d1*d2));
             break;
case "div": System.out.println("Div=" +(d1/d2));
             break;
case "exit":System.out.println("Exiting...");
exit=true;
             break;
default: System.out.println("Invalid");
}
}
}
} 

//changes from dbda5

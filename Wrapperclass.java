import java.util.Scanner;
 class Wrapperclass{

    public static void main(String[] args) {
int a = 10;
Integer b = a;
Integer c = 10;
int d=c;
System.out.println("The vlue of a is: "+a);
System.out.println("The vlue of b wrapperclass is: "+a);
System.out.println("The vlue of c wrapperclass is: "+a);
System.out.println("The vlue of d wrapperclass is: "+a);
    }
 }

 class Wrapperclass2{

    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("The vlue of str is: "+str);
        System.out.println("The vlue of num is: "+num);
    }
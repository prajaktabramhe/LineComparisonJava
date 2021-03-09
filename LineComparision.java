 import java.util.Scanner;
 public class LineComparision {


       public static void main(String args[]) {
                //Declaration
                double x1, x2, y1, y2, LengthofLine, LengthofLine2; 
                
                Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the value of x1");
                //taking input from user
	        x1 = scan.nextDouble();
	        System.out.println("Enter the value of x2");
                //taking input from user
                x2 = scan.nextDouble();
	        System.out.println("Enter the value of y1");
                //taking input from user
		y1 = scan.nextDouble();
		System.out.println("Enter the value of y2");
                //taking input from user
                y2 = scan.nextDouble();

		LengthofLine = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
		System.out.println(LengthofLine);
                
                System.out.println("Enter the value of x1");
                //taking input from user
                x1 = scan.nextDouble();
                System.out.println("Enter the value of x2");
                //taking input from user
                x2 = scan.nextDouble();
                System.out.println("Enter the value of y1");
                //taking input from user
                y1 = scan.nextDouble();
                System.out.println("Enter the value of y2");
                //taking input from user
                y2 = scan.nextDouble();

                LengthofLine2 = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
                System.out.println(LengthofLine);


                String s1,s2;
		s1=Double.toString(LengthofLine);
		s2=Double.toString(LengthofLine2);
	        System.out.println("Equality of two length is: " + s1.equals(s2));
                System.out.println("Compare of two length is: " + s1.compareTo(s2));	
      }
 }

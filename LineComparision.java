 import java.util.Scanner;
 public class LineComparision {


       public static void main(String args[]) {
                //Declaration
                double x1, x2, y1, y2, LengthofLine, LengthofLine2; 

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the values for Line 1");	
                System.out.println("Enter the value of x1");
                //taking input from user for x1, x2, y1, y2 of Line1
	        x1 = scan.nextDouble();
	        System.out.println("Enter the value of x2");
                x2 = scan.nextDouble();
	        System.out.println("Enter the value of y1");
                y1 = scan.nextDouble();
		System.out.println("Enter the value of y2");
                y2 = scan.nextDouble();

		LengthofLine = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
		System.out.println("Length of Line 1:" + LengthofLine);

                System.out.println("Enter the values for Line 2");
                System.out.println("Enter the value of x1");
                //taking input from user for x1, x2, y1, y2 of Line2
                x1 = scan.nextDouble();
                System.out.println("Enter the value of x2");
                x2 = scan.nextDouble();
                System.out.println("Enter the value of y1");
                y1 = scan.nextDouble();
                System.out.println("Enter the value of y2");
                y2 = scan.nextDouble();

                LengthofLine2 = Math.sqrt((Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)));
                System.out.println("Length of Line 2:" + LengthofLine2);


                String s1,s2;
		s1=Double.toString(LengthofLine);
		s2=Double.toString(LengthofLine2);
	        System.out.println("equality of two lines using Equal method: " + s1.equals(s2));
                System.out.println("Compare of two length is: " + s1.compareTo(s2));	
      }
 }

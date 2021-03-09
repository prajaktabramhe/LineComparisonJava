 import java.util.Scanner;
 public class LineComparision {


       public static void main(String args[]) {
                //Declaration
                double x1, x2, y1, y2, LengthofLine; 
                
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

      }
 }

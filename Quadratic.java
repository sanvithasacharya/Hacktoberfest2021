package PRACTICE;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter the value of a: ");
				double a = userInput.nextDouble();
				System.out.println("Enter the value of b: ");
						double b = userInput.nextDouble();
						System.out.println("Enter the value of c: ");
						double c = userInput.nextDouble();
						if(a==0)
						{
							System.out.println("The roots cannot be determined");
						}
						else {
							double d = Math.sqrt((b * b)-(4 * a * c));
						if(d>0) {
							System.out.println("The roots are real but different");
							double r1 = (-b+d)/(2*a);
							double r2 = (-b-d)/(2*a);
							System.out.println("The roots r1 =" + r1 + "and root r2 = " + r2);
						}
							else if(d==0) {
								System.out.println("The roots are real and equal");
								double r1 = (-b+d)/(2*a);
								double r2 = (-b-d)/(2*a);
								System.out.println("The roots r1 =" + r1 + "and root r2 = " + r2);
							}
							else {
								System.out.println("The roots are not equal");
							}
						}
			}

		}


	

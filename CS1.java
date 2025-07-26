//CS1.java
//Control Structure

/*
*Olatunji Israel Oladotun
*Saturday 26th July 2025
*04:17am
*/ 
import java.util.Scanner;
public class CS1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x;
		int y;
	
		x = input.nextInt();
		y = input.nextInt();

		if (x > 5) {
			if (y > 5)
				System.out.println("x and y are > 5");
			else
				System.out.println("x is < 5");
		}
		else
			System.out.println("x is <= 5");
	
	
	
	
	
	}
}
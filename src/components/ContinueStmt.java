package components;

import java.util.Random; // Package for generating random number
public class ContinueStmt {

	public static void main(String[] args) {
		final int i=10, range = i-1;  // constant variables i and range
		int x,y,z;
		Random Rand = new Random();  // an instance for random number generator
		// continue statement without label
		for (int j = 0; j<10; j++)
		{
			if (j==5) continue; // skips the code below when j=5
			System.out.println("J: "+j);
 
		}
		// Continue statement with statement label
		ContinueOuterLoop : for (x=0; x<i; x++) {
			System.out.println("x = "+ x + " : ");
			ContinueInnerLoop: for (y=0; y<i; y++) {
				z = Rand.nextInt(range);
				System.out.println("Random Number : "+z);
				if (z==4)continue ContinueOuterLoop; // jump to ConitnueOuterLoop
				if (z==5)continue ContinueInnerLoop; // jump to ContinueInnerLoop
				
			}
		}
	}

}

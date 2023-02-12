
import java.util.Random; // Package for generating random number
public class BreakStmt {

	public static void main(String[] args) {
		final int i=10, range = i-1;  // constant variables i and range
		int x,y,z;
		Random Rand = new Random();  // an instance for random number generator
		// break statement without label
		for (int j = 0; j<10; j++)
		{
			System.out.println("J: "+j);
			break; //jump out of loop
		}
		// break statement with statement label
		exitOuterLoop : for (x=0; x<i; x++) {
			System.out.println("x = "+ x + " : ");
			exitInnerLoop: for (y=0; y<i; y++) {
				z = Rand.nextInt(range);
				System.out.println("Random Number : "+z);
				if (z==4)break exitOuterLoop; // jump to exitOuterLoop
				if (z==5)break exitInnerLoop; // jump to exitInnerLoop
				
			}
		}
		

	}

}

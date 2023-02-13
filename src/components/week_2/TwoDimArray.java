package components.week_2;

public class TwoDimArray {

	public static void main(String[] args) {
		int a,b;
		int Numbers[][]= new int [3][3];
		for(a=0; a<Numbers.length; a++)
			for(b=0; b<Numbers.length; b++)
				Numbers[a][b]=a+b;
		
		for(a=0; a<Numbers.length;a++)
		{
			System.out.println("\n");
			for(b=0;  b<Numbers.length; b++)
				System.out.println(Numbers[a][b]+" ");
		}

	}

}

package techouts;

public class RightPascalsTriangle {

	public static void main(String[] args) {

		int n=7;
		int x=1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=x; j++) {
				
				System.out.printf("%3c", '*');
			}
			
			System.out.println();
			
			if(i<=n/2)
				x++;
			else
				x--;
		}

	}

}

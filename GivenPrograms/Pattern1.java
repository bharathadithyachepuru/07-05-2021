package techouts;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n = 7;
        int x = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= x && j <= n - x + 1)
                    System.out.printf("%2c", '*');
                else
                    System.out.printf("%2c", ' ');
            }
            if (i <= n / 2)
                x--;
            else
                x++;
            System.out.println();
        }
	}

}


public class Pattern05 {
	public static void main(String[] args) {
		int n=11;
		
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i+j<=(n-1)/2)|| (i-j>=(n-1)/2) || i==0 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}

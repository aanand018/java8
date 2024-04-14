package pattern;

public class Patterns {
	public static void main(String[] args) {

		int n=3;

		char c='*';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else { 
					System.out.print(c+" ");
				}
			}
			System.out.println();
		}




		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {

				if(i+j<n+1) {
					System.out.print(" ");
				}
				else {
					System.out.print(c+" ");
				}

			}
			System.out.println();



		}





		System.out.println("________________________");


		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {

				if(i+j<n+1) {
					System.out.print(" ");
				}
				else {
					System.out.print(c+"");
				}

			}

			for(int j=1;j<=n;j++) {

				if(i>j) {
					System.out.print(c+"");
				}
				else {
					System.out.print(" ");
				}

			}

			System.out.println();



		}













	}

}

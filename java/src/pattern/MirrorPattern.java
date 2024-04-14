package pattern;

public class MirrorPattern {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				if(i>=j) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				}
				
				for(int j=1;j<=5;j++) {
					if(i+j>=5+1) {
					System.out.print("*");}
					else {
						System.out.print(" ");
					}
					
					
			}
				System.out.println();
				
				
		}
	
	
	
		
		int num=-12345;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev);
	
	
	
	
	
	
	
	
	}

}

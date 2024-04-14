package pattern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RadwareStringg {

	public static void main(String[] args) {


		String s1="abcda";
		String s2="acdaa";
		String s3="";

		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		
		for(int i=0;i<c1.length;i++) {
			int c=1;
			for(int j=0;j<c2.length;j++) {
				if(c==1 && c1[i]==c2[j]) {
				 s3=s3+c1[i];
					c2[j]='0';
					c=c+1;
					
				}
			}
		}
		System.out.println(s3);
		
		
		Stream<Integer> s=Stream.of(1,2,3,4,5,5);
		
		//List<Integer> l=s.filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> l1=s.filter(n->n%2!=0).collect(Collectors.toList());
		
		
		/*
		 * for(int n:l) { System.out.println(n); }
		 */
		for(int n:l1) {
			System.out.println(n);
		}
		
		
		
		



	}
}
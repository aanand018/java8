package pattern;



interface Calc{
	void m1(int i1,int i2);
	
	
}

public class CalcImpl {
	public static void main(String[] args) {
	
		Calc c=(i1,i2)->System.out.println(i1-i2);
	    c.m1(12,23);
	
		
	}

}

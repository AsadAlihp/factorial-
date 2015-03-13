package fac;

public class Fact {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int fac=1;
		int b = 1;
		//USING WHILE LOOP::::::
		while(b<a+1){
			fac=fac*b;
			b++;
		}System.out.println(fac);
	}

	
}

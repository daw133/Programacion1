package ejercicios;

public class E08Expresiones {

	public static void main(String[] args) {
		int X,Z,Y;
		final double PI=3.14;
		
			System.out.println(((4-2)*(5+1)/2) > (2-(4+3)));
        	System.out.println( ((6+3)>8) && ((6-1)* 2 < 8) || (2*3==8));
        X=7;
        Z=2;
        	System.out.println((1.0 < X) && (X < Z+7.0));
        X=1;
        Z=10;
        Y=4;
        	System.out.println( PI*Math.pow(X,X)>Y || 2*PI*X<=Z );
        	System.out.println( X>3 && Y==4 || X + Y <= Z);
        Z=1;
        	System.out.println(X>3 && (Y==4 || X + Y <= Z));

	}
}
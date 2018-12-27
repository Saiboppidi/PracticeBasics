package operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =2;
		/**
		 * b=a;
		 * a=a+1;
		 */
		int b = ++a  + a;
		System.out.println(b);//b=2,a=3
		/**
		 * a=a+1;
		 * b=a;
		 */
		b = ++a;
		System.out.println(b);
		int c = a;
		System.out.println(b);
		System.out.println(c);
		b=3;
		/**
		 * a=b ;
		 * b= b-1;
		 */
		a=b--; 
		System.out.println(a);
        a= 5;
        /**
         * a= a-1;
         * b=a;
         */
        b= --a;      
        System.out.println(b);
        
        a=12;
        a = (a++)+(++a);//((12)+(14))
        System.out.println("Guess ? "+ (a));
        System.out.println(a);
		
	}
	

}

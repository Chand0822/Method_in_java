package warperClass;

public class Test {

	public static void main(String[] args) {
		System.out.println("......... Char........ ");
		char a='c';
		System.out.println("prinativ value for char " +a);
		Character p=new Character(a);
		System.out.println("Wraper class value for byte "+p);
		System.out.println("......................... ");
		
		System.out.println("......... Byte........ ");
		byte b=10;
		System.out.println("prinativ value for byte "+b);
		Byte o=new Byte(b);
		System.out.println("Wraper class value for byte "+o);
		System.out.println("......................... ");
		
		
		System.out.println("......... short........ ");
		short c=13;
		System.out.println("prinativ value for short "+c);
		Short u =new Short(c);
		System.out.println("Wraper class value for short "+u);
		System.out.println("......................... ");
		
		System.out.println("......... int........ ");
		int d=10;
		System.out.println("prinativ value for int " +d);
		Integer l=new Integer(d);
		System.out.println("Wraper class value for int "+l);
		System.out.println("......................... ");
		
		System.out.println("......... long........ ");
		long e=34l;
		System.out.println("prinativ value for long " +e);
		Long v =new Long(e);
		System.out.println("Wraper class value for long "+v);
		System.out.println("......................... ");
		
		System.out.println("......... float........ ");
		float f =2.34f;
		System.out.println("prinativ value for float " +f);
		Float m =new Float(f);
		System.out.println("Wraper class value for float "+m);
		System.out.println("......................... ");
		
		System.out.println("......... double........ ");
		double g=34.78699;
		System.out.println("prinativ value for double " +g);
		Double n =new Double(g);
		System.out.println("Wraper class value for double "+n);
		System.out.println("......................... ");
		
		
		System.out.println("......... boolean........ ");
		boolean i = true;
		System.out.println("prinativ value for boolean " +i);	
		Boolean x =new Boolean(!i);
		System.out.println("Wraper class value for boolean "+x);
		System.out.println("......................... ");
		

	}

}

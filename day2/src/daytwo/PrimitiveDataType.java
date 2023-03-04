package daytwo;

public class PrimitiveDataType {
	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		
		System.out.println("min range os nyte is :"+byteMin+ "max limit of byte is :"+byteMax);
		
		//short-2byte
		short shortMax=32767;
		short shortMin=-32768;
		
		System.out.println("minshort range os nyte is: "+shortMin+ "maxshort limit of byte is: "+shortMax);
		
		//int -4byte
		int maxint=2147483647;
		int minint=-2147483648;
		System.out.println("minint range os nyte is :"+minint+ "maxint limit of byte is: "+maxint);
		
		
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L;
		System.out.println("minlong range os nyte is: "+minlong+ "maxlong limit of byte is :"+maxlong);
		
		
		boolean flag=true;
		System.out.println("boolean value is :"+flag);
	}

}

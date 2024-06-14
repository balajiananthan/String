package StringBuffer;  //length methd  and capacity method

public class lLength {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("");
		System.out.println(sb.capacity());
		sb=sb.append("balajiisabeautys");
		System.out.println(sb.capacity());
		sb=sb.append("q");
		System.out.println(sb.capacity());
		
		StringBuffer sb2=new StringBuffer("java");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		
		
	}

}

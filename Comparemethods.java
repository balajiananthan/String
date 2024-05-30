package String;

public class Comparemethods {
	public static void main(String args[]) {
		String s1=new String("PHP");
		String s2="Java";
		String s3=new String("C");
		String s4="Phyton";
		String s5="Phyton";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));// postive
		System.out.println(s3.compareTo(s4));// -negative
		System.out.println(s4.compareTo(s5));//0
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.startsWith("P"));
		System.out.println(s4.endsWith("on"));
	}

}

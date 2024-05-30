package String;

public class Stringconstantpool {
	public static  void main( String args[]){
		String s1=new String("jav");
		String s2=new String ("java");
	
	String s3="jav";
    s1=s1+"a";
	String s4= "java";
	String s5=" javaprogram";
	String s6="java";
	String s7=s6+"program";
	String s8="java";
	String s9=s8+"program";
	if(s1==s3)
		System.out.println("==");
		else
		System.out.println("not ==");
		if(s1.equals(s3))
			System.out.println(" equal ");
		else
			System.out.println(" Not equal");

}
}

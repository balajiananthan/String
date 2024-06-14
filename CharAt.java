package StringBuffer;//setcharAt

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s =new StringBuffer("hello world");
		System.out.println(s.charAt(4));
		s.setCharAt(3, 'e');
		System.out.println(s);
		s.insert(4, "balaji");
		System.out.println(s);
		s.delete(4, 9);
		System.out.println(s);
		s.deleteCharAt(5);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		s.setLength(5);
		StringBuffer s2 =new StringBuffer(1000);
		
		s.ensureCapacity(6);
		System.out.println(s.capacity());
		
		StringBuffer s5 =new StringBuffer(1000);
		System.out.println(s2.capacity());
		s2.append("abc");
		s2.trimToSize();
		System.out.println(s2.capacity());
		
		StringBuffer s3 =new StringBuffer("java");
		StringBuffer s4 =new StringBuffer("java");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
	}

}

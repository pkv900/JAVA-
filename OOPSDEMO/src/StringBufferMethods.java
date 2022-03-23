
public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("SRIVENKATESWARA");
		StringBuffer stb = new StringBuffer(s);
		stb.reverse();
		System.out.println("Reverse is:"+stb);
		System.out.println("Capacity is:"+stb.capacity());
		System.out.println("Character at:"+stb.charAt(3));
		System.out.println("delete 2,4:"+stb.delete(2, 4));
		System.out.println("delete char at:"+stb.deleteCharAt(3));
		System.out.println("Insert at:"+stb.insert(2,'o'));
		System.out.println("replace:"+stb.replace(2,3,"sr"));
	}

}

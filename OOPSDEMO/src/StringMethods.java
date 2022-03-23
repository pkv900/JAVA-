
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "Prashant Verma";
		 String str2 = "  Verma  ";
	     String str3 = "India";
	     String str4 = "samsung";
	         
	        System.out.println(str1.compareTo(str2));
	        System.out.println(str3.compareTo(str4));
	      
	        System.out.println(str1.length());
	        
	        System.out.println(str1.concat(str2));
	        
	        String replace = str1.replace('P', 'p');
	        System.out.println(str1);
	        System.out.println(replace);
	       
	        System.out.println(str2.toLowerCase());

	        System.out.println(str4.toUpperCase());
	        
	        System.out.println(str2.trim()+"");
	}

}

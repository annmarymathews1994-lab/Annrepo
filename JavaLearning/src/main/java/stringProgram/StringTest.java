package stringProgram;

public class StringTest {

	public static void main(String[] args) {
		
		//String literal
		String s = "hello";
		
		//String with new keyword
		String s1 = new String("Ann");
		
		System.out.println(s);
		System.out.println(s1);
		
		//charAt() - to return the character of the String based on index position
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(3));
		System.out.println(s1.charAt(2));
		
		//length() - to return the size/length of the string
		System.out.println(s.length());
		System.out.println(s1.length());
		
		//concat() - to add
		System.out.println(s.concat(s1));
		System.out.println(s.concat(s1).concat("this is a test"));
		
		//contains() - to check whether a character present in the string. true or false will be returned
		System.out.println(s.contains("h"));
		System.out.println(s1.contains("A"));
		
		//isEmpty() - to check whether a string is empty or no - true or false will be returned
		System.out.println(s.isEmpty());
		
		String w = "";
		System.out.println(w.isEmpty());
		
		//valueOf() - to convert any datatype to String
		int a = 5;
		System.out.println(String.valueOf(a));
		
		String t = "java";
		String d = "Java";
		String q = "java";
		
		//equals() - to check whether 2 string are qual or not.
		System.out.println(t.equals(d));
		System.out.println(t.equals(q));
		
		//equalsIgnoreCase() 
		System.out.println(d.equalsIgnoreCase(q));
		
		// 11.2.2026
		
		String st = new String("java");
		System.out.println(t.equals(st));
		System.out.println(s1.equals(st));
		
		System.out.println(t==q); // use operator instead of equals(). True becoz string literal is sharing same memory
		System.out.println(t==st); // equal operator used to check string literal and new keyword. Her it will give false as it compares the reference. but equals() will compare the value
		System.out.println(s1==st);
		
		// toUpperCase()
		System.out.println(t.toUpperCase());
		
		//toLowerCase()
		System.out.println(t.toLowerCase());
		
		//trim() - to remove the leading and trailing spaces		
		String a1 = " this Stringa ";
		System.out.println(a1.trim());
		
		//subString()
		System.out.println(a1.substring(4));
		System.out.println(a1.substring(4,7));
		
		
		
	}

}

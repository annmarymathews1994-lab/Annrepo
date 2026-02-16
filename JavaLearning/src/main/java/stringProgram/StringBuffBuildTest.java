package stringProgram;

public class StringBuffBuildTest {

	public static void main(String[] args) {
		//StringBuffer and StringBuilder - mutable String
		
				StringBuffer sb = new StringBuffer("hello");
				StringBuilder sbs = new StringBuilder("hii");
				
				System.out.println(sb);
				System.out.println(sbs);
		
		// insert()
		System.out.println(sb.insert(1, 't'));
		System.out.println(sb);
		
		// append()
		System.out.println(sb.append('g'));
		System.out.println(sb.append(sbs));
		
		// replace()
		System.out.println(sb.replace(3, 6, "new"));
		
		//delete()
		System.out.println(sb.delete(1, 6));
		
		//reverse()
		System.out.println(sb.reverse()); 

	}

}

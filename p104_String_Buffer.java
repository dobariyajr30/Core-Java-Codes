package p101;

public class p104_String_Buffer {
	public static void main(String[] args) throws Exception
	{
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append(" It's Me jash");
		System.out.println(sb);
		
		sb.insert(0,"Hmm ");
		System.out.println(sb);
		
		sb.replace(0,3,"... ");
		System.out.println(sb);
		
		sb.delete(0,3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}

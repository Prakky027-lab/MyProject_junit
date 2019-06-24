package cg;

public class Validator {
	
	public int getSizeinMl1(Size size)
	{
		System.out.println(size+" "+size.getMl());
		return size.getMl();
		
	}
	
	public boolean validateNo(String data)
	{
		return data.matches("\\d+");
	}
	public boolean isPalindrome(String data)
	{
		StringBuffer sb=new StringBuffer(data);
		String reverseS=sb.reverse().toString();
		return data.equals(reverseS);
	}

	public int getSizeinMl(Size size) {
		// TODO Auto-generated method stub
		System.out.println(size+" "+size.getMl());
		return size.getMl();
	}
}

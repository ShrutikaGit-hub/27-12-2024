package firstprojectpackage;

class palindrome{
	public static void main(String []args) {
		int y = 121;
		int n = 0, rev = 0, p = y;
		while(y>0) {
			n = y % 10;
			rev = (rev*10)+n;
			y = y /10;
		}
		
		if(rev == p) {
			System.out.print("palindrome");
		}
		else {
			System.out.print("not palindrome");
		}
	}
}
package firstprojectpackage;

class reversenumber{
	public static void main(String []args) {
		int y = 1234;
		int n = 0, rev = 0;
		while(y>0) {
			n = y % 10;
			rev = (rev*10)+n;
			y = y /10;
		}
		System.out.print(rev);
	}
}
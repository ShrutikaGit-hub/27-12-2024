package firstprojectpackage;

class sumofdigit{
	public static void main(String []args) {
		int y = 123;
		int sum = 0, n = 0;
		while(y > 0) {
			n = y % 10;
			sum = sum + n;
			y = y / 10;
		}
		System.out.print(sum);
	}
}
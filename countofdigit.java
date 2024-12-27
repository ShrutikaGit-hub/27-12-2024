package firstprojectpackage;

class countofdigit{
	public static void main(String []args) {
		int y = 123458;
		int count = 0, n = 0;
		while(y > 0) {
			n = y % 10;
			count++;
			y = y / 10;
		}
		System.out.print(count);
	}
}
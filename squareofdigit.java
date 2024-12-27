package firstprojectpackage;

class squareofdigit{
	public static void main(String []args) {
		int y = 1234;
		int n = 0;
		while(y>0) {
			n = y % 10;
			System.out.println(n*n);
			y = y / 10;
		}
	}
}
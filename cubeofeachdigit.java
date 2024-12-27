package firstprojectpackage;

class cubeofeachdigit{
	public static void main(String []args) {
		int y = 123458;
		int n = 0;
		while(y>0) {
			n = y % 10;
			System.out.println(n*n*n);
			y = y / 10;
		}
	}
}
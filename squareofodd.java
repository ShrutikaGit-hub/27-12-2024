package firstprojectpackage;

class squareofodd{
	public static void main(String []args) {
		int y = 1234;
		int n = 0;
		while(y>0) {
			n = y % 10;
			if(n%2 != 0) {
				System.out.println(n*n);
			}
			y = y / 10;
		}
	}
}
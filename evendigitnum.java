package firstprojectpackage;

class evendigitnum{
	public static void main(String []args) {
		int y = 123458;
		int n = 0;
		while(y>0) {
			n = y % 10;
			if(n%2 == 0) {
				System.out.print(n);
			}
			y = y / 10;
		}
	}
}
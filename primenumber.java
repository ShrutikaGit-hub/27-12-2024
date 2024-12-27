package firstprojectpackage;

class primenumber{
	public static void main(String []args) {
		int y = 4;
		int count = 0;
		for(int i = 1; i <= y; i++) {
			if(y % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not Prime");
		}
	}
}
package firstprojectpackage;

public class eachdigit {
     public static void main(String []args) {
    	 int y = 1234;
    	 int n = 0;
    	 while(y>0) {
    		 System.out.println(y);
    		 n = y % 10;
    		 System.out.println(n);
    		 y = y/10;
    	 }
     }
}

package Assignments;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int c=0,a,temp;
		int n=153;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		if(temp==c) {
			System.out.println("Number is Armstrong");
			
		}
		else {
			System.out.println("Number is not Armstrong");
		}
	}

}

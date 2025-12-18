import java.util.Scanner;
class SumRec{
	public static int rsum(int n,int sum){
		if(n == 0) return sum;
		sum = sum+Math.abs(n%10);
		return rsum(n/10,sum);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(rsum(sc.nextInt(),0));	
	}
}
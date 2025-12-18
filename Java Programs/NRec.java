class NRec{
    public static void main(String args[]){
        print(10);
		printF(10,1);
	}
    public static void print(int n){
		if(n == 0) return;
		print(n-1);
		System.out.println(n);
    }
 	public static void printF(int n,int i){
		if(i>n){
			return;
		}
	System.out.println(i);
	printF(n,i+1);
	}
}
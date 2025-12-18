import java.util.*;
class ArrSort{
	public static void main(String args[]){
		int[] arr = {12,27,7,4,6,2,3,5,1,16};
		
		
		System.out.println(order(arr));
	}
	public static ArrayList<Integer> order(int[] arr){
		Arrays.sort(arr);
		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i = 0;i<arr.length;i++)
		{	
			if(arr[i]%2!=0){
				res.add(arr[i]);
			}
			if(arr[i]%2==0){
				even.add(arr[i]);
			}
		}
		res.addAll(even);
		return res;
	}
}
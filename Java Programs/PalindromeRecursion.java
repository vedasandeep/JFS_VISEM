import java.util.Scanner;
class PalindromeRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] in = input.split("");
        System.out.println(check(in,0,in.length-1));
    }
    public static boolean check(String[] str,int left, int right){
        if(left>=right) return true;

        if(!str[left].toLowerCase().equals(str[right].toLowerCase())){
            return false;
        }
        return check(str, left + 1, right - 1);
    }
}
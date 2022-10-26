import java.util.*;
public class CoinDenomination {
	
	public static void coinDenomination(int num) {
		if(num > 40) {
			System.out.println("Insufficient Coins");
		}
		int five = num/5;
		if(five > 5) {
			five = 5;
		}
		int left = num - (five*5);
		int two = left/2;
		if(two > 5) {
			two = 5;
		}
		left = left - (two*2);
		int one = left/1;
		int ans = five+two+one;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coinDenomination(n);

	}

}
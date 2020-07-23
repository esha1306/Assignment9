
public class PrintHundredNos {
	
	static void reverseNo(int n) {
		if(n <= 100) {
			reverseNo(n + 1);
			System.out.println(n + " ");
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNo(0);
	}
	
}

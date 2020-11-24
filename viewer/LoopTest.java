package viewer;

public class LoopTest {
	public static void main(String[] args) {
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		int sum = 0;
		for(int i=1; i<= 10; i++) {
			
			if(i != 10) {
				sum = sum + i; 
				System.out.printf("%d + ",i);
			}else{
				System.out.printf("%d = ",i);
			}
		}
		System.out.printf(" 결과: %d ", sum);
	}
}

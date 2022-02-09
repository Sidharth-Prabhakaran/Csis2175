
public class arrayPrac {

	public static void main(String[] args) {
		
		
		
		int[][] rents = { {400, 450, 510}, 
				  {500, 560, 630},
				  {625, 676, 740},
				  {1000, 1250, 1600} };
		for(int[] rent:rents) {
			for(int r:rent)
				System.out.println(r);
		}

	}
//		// TODO Auto-generated method stub
//		int[] sales = {1,9,102,3,4,5,6,7,8,9,0};
//		int phase = 1;
//		int size = sales.length;
//		for (int i = 1 ; i<= size ; i++) {
//			for (int j = 0 ; j< size-phase; j++) {
//				if (sales[j] > sales[j+1]) {
//					int temp = sales[j+1];
//					sales[j+1]= sales[j];
//					sales[j] = temp;
//				}
//			}phase++;
//		}
//		for(int num:sales) {
//			System.out.println(num);
//		}
//		
//		
//		
//		String[] test = {"sid", "mad","mek"};
//		System.out.println(test[1]);
//	}

}

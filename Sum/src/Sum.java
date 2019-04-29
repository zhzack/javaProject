public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if(i%3==0||i%5==0){
				sum+=i;
				
			}
		}
System.out.println("一千以内（包括1000）能被3或者5整除的所有整数之和"+sum);
	}

}

class License
{
	public static void main(String[] agrs)
	{
		int numbers;
		char letters;

		for(int i = 0; i < 20; i++){
		    
			for(int j = 0; j < 3; j++){
			    numbers = 1 + ((int)(9*Math.random())); // the 1 is added so we don't get a zero
				System.out.print(numbers);
			} 
			
			System.out.print("  ");
			
			for(int k = 0; k < 3; k++){
			    numbers = 65+((int)(26*Math.random()));	
				System.out.print((char)numbers);		
			}
			
			System.out.println();
		}
	}
}
public class Box {
	public static void main (String[] args) 
	
	public int size = 0;
	
	public void printBox()	
			{
			for(int i = 0; i < size; i++)
				{
				for(int j = 0; j < size; j++)
					{
					System.out.print("*");
					}
					System.out.println();
					}
					}
					{
		Box myBox = new Box();
					
		//tells system what the size of the box will be
		myBox.size = 5;
		myBox.printBox();

			}		
	}



